package project.wipro.transaction.model;

import lombok.Data;

@Data
public class TransactionResponse {

	private String message;
	private BookingResponse bookingResponse;
}
