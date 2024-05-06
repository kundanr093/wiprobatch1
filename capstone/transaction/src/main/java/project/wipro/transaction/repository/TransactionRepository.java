package project.wipro.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.wipro.transaction.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Integer>{

	boolean existsByBookingId(int bookingId);
}
