package project.wipro.hotel.service;

import java.util.List;

import project.wipro.hotel.entity.Hotel;

public interface IHotelService {

	Hotel addHotel(Hotel hotel);
	
	Hotel updateHotel(Hotel hotel);
	
	Hotel removeHotel(int hotelId);
	
	List<Hotel> showAllHotels();
	
	Hotel showHotel(int hotelId);
}
