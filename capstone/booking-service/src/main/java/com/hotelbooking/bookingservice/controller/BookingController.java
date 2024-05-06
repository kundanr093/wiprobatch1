package com.hotelbooking.bookingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.bookingservice.entity.Booking;
import com.hotelbooking.bookingservice.model.BookingResponse;
import com.hotelbooking.bookingservice.service.IBookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	IBookingService bookingService;
	
	@PostMapping("/add")
	public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
		return new ResponseEntity<Booking>(bookingService.addBooking(booking),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BookingResponse> getBookingDetailsById(@PathVariable int id){
		return new ResponseEntity<BookingResponse>(bookingService.getBookingDetailsById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking){
		return new ResponseEntity<Booking>(bookingService.updateBooking(booking),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Booking>> getAllBookingDetails(){
		return new ResponseEntity<List<Booking>>(bookingService.getAllBookingDetails(),HttpStatus.OK);
	}
	
	@PutMapping("/cancel/{id}")
	public ResponseEntity<Booking> cancelBooking(@PathVariable int id){
		return new ResponseEntity<Booking>(bookingService.cancelBooking(id),HttpStatus.OK);
	}

}
