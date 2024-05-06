package project.wipro.transaction.service;

import java.util.List;

import project.wipro.transaction.entity.Transaction;
import project.wipro.transaction.model.TransactionResponse;

public interface ITransactionService {

	TransactionResponse makeTxn(Transaction txn);
	
	Transaction viewTxnById(int id);
	
	List<Transaction> viewAllTxn();
}
