package project.wipro.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.wipro.hotel.entity.Room;
import project.wipro.hotel.model.RoomModel;
import project.wipro.hotel.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {



	@Autowired
	private RoomService roomService;

	// add room
	@PostMapping("/save")
	public ResponseEntity<Room> addRoom(@RequestBody RoomModel room) {
		return new ResponseEntity<Room>(roomService.addRoomDetails(room), HttpStatus.CREATED);
	}

	// update room
	@PutMapping("/update")
	public ResponseEntity<Room> updateRoom(@RequestBody Room room) {
		roomService.updateRoomDetails(room);
		ResponseEntity<Room> responseEntity = new ResponseEntity<>(room, HttpStatus.OK);
		return responseEntity;
	}

	// remove room
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteRoom(@PathVariable("id") int roomId) {
		roomService.removeRoomDetails(roomId);
		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}

	// show all room
	@GetMapping("/all")
	public List<Room> showAllRoom() {
		List<Room> room = roomService.showAllRoomDetails();
		return room;
	}

	// show room
	@GetMapping("/{id}")
	public ResponseEntity<Room> getRooms(@PathVariable("id") int roomId) {
		Room room = roomService.getRoom(roomId);
		return new ResponseEntity<>(room, HttpStatus.OK);

	}

}
