package project.wipro.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<String>  handleHotelNotFoundException(Exception e) {		
		ResponseEntity<String> responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;		
	}
	
	@ExceptionHandler(RoomNotFoundException.class)
	public ResponseEntity<String>  handleRoomNotFoundException(Exception e) {		
		ResponseEntity<String> responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;		
	}
}
