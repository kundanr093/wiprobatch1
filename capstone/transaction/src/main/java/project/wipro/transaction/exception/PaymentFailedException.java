package project.wipro.transaction.exception;

public class PaymentFailedException extends RuntimeException{

	public PaymentFailedException(String msg) {
		super(msg);
	}
}
