package project.wipro.hotel.service;

import java.util.List;

import project.wipro.hotel.entity.Room;
import project.wipro.hotel.model.RoomModel;

public interface IRoomService {

	public Room addRoomDetails(RoomModel roomModel);
	
	public Room updateRoomDetails(Room room);
	
	public Room removeRoomDetails(int roomId);
	
	public List<Room> showAllRoomDetails();
	
	public Room getRoom(int roomId);
}