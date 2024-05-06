package project.wipro.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.wipro.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
