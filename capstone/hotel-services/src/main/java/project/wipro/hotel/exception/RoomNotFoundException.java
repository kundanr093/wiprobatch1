package project.wipro.hotel.exception;

public class RoomNotFoundException extends RuntimeException {

	public RoomNotFoundException(String msg) {
		super(msg);
	}
}
