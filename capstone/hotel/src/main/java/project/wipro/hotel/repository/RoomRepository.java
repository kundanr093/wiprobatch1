package project.wipro.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.wipro.hotel.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{

	
}
