package project.wipro.user.service;

import java.util.List;

import project.wipro.user.entity.User;

public interface IUserService {

	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User removeUser(int userId);
	
	public List<User> showAllUsers();
	
	public User showUser(int userId);
}
