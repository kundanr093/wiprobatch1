package project.wipro.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.wipro.hotel.entity.Hotel;
import project.wipro.hotel.exception.HotelNotFoundException;
import project.wipro.hotel.repository.HotelRepository;

@Service
public class HotelService implements IHotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	//create hotel
	@Override
	public Hotel addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		return hotel;
	}
	
	//update hotel details
	@Override
	public Hotel updateHotel(Hotel hotel) {
		Optional<Hotel> optionalHotel = hotelRepository.findById(hotel.getHotelId());
		if(optionalHotel.isEmpty()) {
			throw new HotelNotFoundException("Hotel does not exists with id: "+hotel.getHotelId());
		}
		hotelRepository.save(hotel);
		return hotel;
	}

	//delete hotel
	@Override
	public Hotel removeHotel(int hotelId) {
		Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
		if(optionalHotel.isEmpty()) {
			throw new HotelNotFoundException("Hotel not found with id: "+hotelId);
		}
		Hotel hotel = optionalHotel.get();
		hotelRepository.delete(hotel);
		return hotel;
	}

	//get details of all hotel
	@Override
	public List<Hotel> showAllHotels() {
		List<Hotel> hotel = hotelRepository.findAll();
		return hotel;
	}

	// get hotel by id
	@Override
	public Hotel showHotel(int hotelId) {
		Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
		if(optionalHotel.isEmpty()) {
			throw new HotelNotFoundException("Hote not found with id: "+hotelId);
		}
		Hotel hotel = optionalHotel.get();		
		return hotel;
	}

	
}
