package project.wipro.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.wipro.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
