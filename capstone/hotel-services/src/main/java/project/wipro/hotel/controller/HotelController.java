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

import project.wipro.hotel.entity.Hotel;
import project.wipro.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	//add hotel
	@PostMapping("/save")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		hotelService.addHotel(hotel);
		ResponseEntity<Hotel> responseEntity = new ResponseEntity<>(hotel, HttpStatus.CREATED);
		return responseEntity;
	}
	
	//update hotel
	@PutMapping("/update")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
		hotelService.updateHotel(hotel);
		ResponseEntity<Hotel> responseEntity = new ResponseEntity<>(hotel, HttpStatus.OK);
		return responseEntity;
	}
	
	//remove hotel
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteHotel(@PathVariable("id") int hotelId){
		hotelService.removeHotel(hotelId);
		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}
	
	//show all hotel
	@GetMapping("/all")
	public List<Hotel> showAllHotel(){
		List<Hotel> hotel = hotelService.showAllHotels();
		return hotel;
	}
	//show hotel
	@GetMapping("/show/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable("id") int hotelId){
		Hotel hotel = hotelService.showHotel(hotelId);
		return new ResponseEntity<>(hotel,HttpStatus.OK);
		
	}
}
