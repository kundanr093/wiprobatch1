package project.wipro.transaction.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Transaction {

	@Id
	private int paymentId;
	private int bookingId;
	private double amount;
	private LocalDate txnDate;
	

}
