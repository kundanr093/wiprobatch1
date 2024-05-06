package com.hotelbooking.bookingservice.service;

import java.util.List;

import com.hotelbooking.bookingservice.entity.Booking;
import com.hotelbooking.bookingservice.model.BookingResponse;

public interface IBookingService {
	
	Booking addBooking(Booking booking);
	
	BookingResponse getBookingDetailsById(int id);
	
	List<Booking> getAllBookingDetails();
	
	Booking updateBooking(Booking booking);
	
	Booking cancelBooking(int id);

}
