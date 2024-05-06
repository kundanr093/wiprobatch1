package project.wipro.transaction.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import project.wipro.transaction.model.BookingResponse;

@FeignClient(name="BOOKING-SERVICE")
public interface IBookingService {

	@GetMapping("booking/{id}")
	public BookingResponse getBookingDetailsById(@PathVariable int id);
}
