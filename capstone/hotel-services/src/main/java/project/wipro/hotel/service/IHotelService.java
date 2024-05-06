package project.wipro.hotel.service;

import java.util.List;

import project.wipro.hotel.entity.Hotel;
import project.wipro.hotel.entity.Room;
import project.wipro.hotel.model.RoomModel;

public interface IHotelService {

	Hotel addHotel(Hotel hotel);

	Hotel updateHotel(Hotel hotel);

	Hotel removeHotel(int hotelId);

	List<Hotel> showAllHotels();

	Hotel showHotel(int hotelId);


}
