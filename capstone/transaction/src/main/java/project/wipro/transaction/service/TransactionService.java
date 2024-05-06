package project.wipro.transaction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.TransactionalException;
import project.wipro.transaction.entity.Transaction;
import project.wipro.transaction.exception.PaymentFailedException;
import project.wipro.transaction.exception.PaymentNotFoundException;
import project.wipro.transaction.model.BookingResponse;
import project.wipro.transaction.model.TransactionResponse;
import project.wipro.transaction.repository.TransactionRepository;

@Service
public class TransactionService implements ITransactionService{

	@Autowired
	private TransactionRepository txnRepository;
	
	@Autowired
	private IBookingService bookingService;
	@Override
	public TransactionResponse makeTxn(Transaction txn) {
		Optional<Transaction> optionalTxn = txnRepository.findById(txn.getBookingId());
		if(optionalTxn.isPresent()) {
			throw new PaymentFailedException("Booking already existing with booking id: "+txn.getBookingId());
		}
		
		BookingResponse bookingResponse = bookingService.getBookingDetailsById(txn.getBookingId());
		
		if (bookingResponse.getAmount() != txn.getAmount()) {
			throw new PaymentFailedException("Payment failed, you need to pay :  "+ bookingResponse.getAmount());
		}
		
		txnRepository.save(txn);
		TransactionResponse presponse = new TransactionResponse();

		presponse.setMessage("Payment Successfull");
		presponse.setBookingResponse(bookingResponse);
		
		return presponse;
	}

	@Override
	public Transaction viewTxnById(int id) {
		Optional<Transaction> optionalTxn = txnRepository.findById(id);
		if(optionalTxn.isEmpty()) {
			throw new PaymentNotFoundException("Paymet not found with id: "+id);
		}
		return optionalTxn.get();
	}

	@Override
	public List<Transaction> viewAllTxn() {
		// TODO Auto-generated method stub
		return txnRepository.findAll();
	}

}
