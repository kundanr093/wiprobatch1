package project.wipro.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import project.wipro.transaction.entity.Transaction;
import project.wipro.transaction.model.TransactionResponse;
import project.wipro.transaction.service.TransactionService;

@RestController
@RequestMapping("/txn")
public class TransactionController {

	@Autowired
	private TransactionService txnService;
	
	@PostMapping("/make")
	public ResponseEntity<TransactionResponse> makePayment(@Valid @RequestBody Transaction txn){
		return new ResponseEntity<TransactionResponse>(txnService.makeTxn(txn),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> viewPaymentById(@PathVariable int id){
		return new ResponseEntity<Transaction>(txnService.viewTxnById(id),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Transaction>> viewAllPayments(){
		return new ResponseEntity<List<Transaction>>(txnService.viewAllTxn(),HttpStatus.OK);
	}

}
