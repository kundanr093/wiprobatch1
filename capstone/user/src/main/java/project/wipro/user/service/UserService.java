package project.wipro.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.wipro.user.entity.User;
import project.wipro.user.exception.UserNotFoundException;
import project.wipro.user.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getUser_id());
		if(optionalUser.isEmpty()) {
			throw new UserNotFoundException("User not found with id: " +user.getUser_id());
		}
		userRepository.save(user);
		return user;
	}

	@Override
	public User removeUser(int userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		if(optionalUser.isEmpty()) {
			throw new UserNotFoundException("User not found ");
		}
		User user = optionalUser.get();
		userRepository.delete(user);
		return user;
	}

	@Override
	public List<User> showAllUsers() {
		List<User> userList = userRepository.findAll();
		if(userList.isEmpty()) {
			throw new UserNotFoundException("No user found...");
		}
		return userList;
	}

	@Override
	public User showUser(int userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		if(optionalUser.isEmpty()) {
			throw new UserNotFoundException("User not available with id: "+userId);
		}
		User user = optionalUser.get();
		return user;
	}

}
