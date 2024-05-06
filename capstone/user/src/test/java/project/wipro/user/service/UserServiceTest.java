package project.wipro.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import project.wipro.user.entity.User;
import project.wipro.user.exception.UserNotFoundException;
import project.wipro.user.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

	
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;
    
    @Test
    public void testCreateUser() {
    	User newUser = new User();
    	newUser.setUser_id(1);
    	newUser.setName("Kundan");
    	newUser.setEmail("kundan@gmail.com");
    	newUser.setMobile("1234567890");
    	newUser.setAddress("ggn");
    	newUser.setPassword("kundan123");
    	newUser.setRole("user");
    	
    	when(userRepository.save(newUser)).thenReturn(newUser);
    	
    	User createdUser = userService.addUser(newUser);
    	
    	assertEquals(newUser.getName(), createdUser.getName());
    	assertEquals(newUser.getUser_id(), createdUser.getUser_id());
    	assertEquals(newUser.getEmail(), createdUser.getEmail());
    	assertEquals(newUser.getMobile(), createdUser.getMobile());
    	assertEquals(newUser.getAddress(), createdUser.getAddress());
    	assertEquals(newUser.getPassword(), createdUser.getPassword());
    	assertEquals(newUser.getRole(), createdUser.getRole());
    	
    }
    
    @Test
    public void testRemoveUser_Success() {
        // Mocking user data
    	User newUser = new User();
    	newUser.setUser_id(1);
    	newUser.setName("Kundan");
    	newUser.setEmail("kundan@gmail.com");
    	newUser.setMobile("1234567890");
    	newUser.setAddress("ggn");
    	newUser.setPassword("kundan123");
    	newUser.setRole("user");

        // Mocking UserRepository's findById method
        when(userRepository.findById(1)).thenReturn(java.util.Optional.of(newUser));

        // Mocking UserRepository's delete method
        doNothing().when(userRepository).delete(newUser);

        // Removing the user
        userService.removeUser(1);

        // Asserting user is removed successfully
        // Additional assertions can be added if necessary
    }
    
    @Test
    public void testRemoveUser_UserNotFound(){
        // Mocking UserRepository's findById method to return null
        when(userRepository.findById(1)).thenReturn(java.util.Optional.empty());

        // Removing a non-existing user should throw UserNotFoundException
        assertThrows(UserNotFoundException.class, () -> userService.removeUser(1));
    }
    
    
    
    @Test
    public void testUpdateUser_Success() {
        // Mocking user data
    	User existingUser = new User();
    	existingUser.setUser_id(1);
    	existingUser.setName("Kundan");
    	existingUser.setEmail("kundan@gmail.com");
    	existingUser.setMobile("1234567890");
    	existingUser.setAddress("Haryana");
    	existingUser.setPassword("kundan123");
    	existingUser.setRole("user");
    	
    	
    	User updateUser = new User();
    	updateUser.setUser_id(1);
    	updateUser.setName("Kundan");
    	updateUser.setEmail("kundan@gmail.com");
    	updateUser.setMobile("1234567890");
    	updateUser.setAddress("ggn");
    	updateUser.setPassword("kundan123");
    	updateUser.setRole("user");

        // Mocking UserRepository's findById method
        when(userRepository.findById(1)).thenReturn(java.util.Optional.of(existingUser));

        // Mocking UserRepository's save method
        when(userRepository.save(updateUser)).thenReturn(updateUser);

        // Updating the user
        User result = userService.updateUser(updateUser);

        // Asserting the updated user
        assertEquals(updateUser.getUser_id(), result.getUser_id());
        assertEquals(updateUser.getEmail(), result.getEmail());
        assertEquals(updateUser.getPassword(), result.getPassword());
    }

    @Test
    public void testUpdateUser_UserNotFound() {
        // Mocking UserRepository's findById method to return null
        when(userRepository.findById(1)).thenReturn(java.util.Optional.empty());

        // Attempting to update a non-existing user should return null
        User updateUser = new User();
    	updateUser.setUser_id(1);
    	updateUser.setName("Kundan");
    	updateUser.setEmail("kundan@gmail.com");
    	updateUser.setMobile("1234567890");
    	updateUser.setAddress("ggn");
    	updateUser.setPassword("kundan123");
    	updateUser.setRole("user");
        User result = userService.updateUser(updateUser);

        assertEquals(null, result);
    }
    
    
    
    @Test
    public void testShowUser_Success() {
        // Mocking user data
    	User newUser = new User();
    	newUser.setUser_id(1);
    	newUser.setName("Kundan");
    	newUser.setEmail("kundan@gmail.com");
    	newUser.setMobile("1234567890");
    	newUser.setAddress("ggn");
    	newUser.setPassword("kundan123");
    	newUser.setRole("user");

        // Mocking UserRepository's findById method
        when(userRepository.findById(1)).thenReturn(Optional.of(newUser));

        // Retrieving the user
        User result = userService.showUser(1);

        // Asserting the retrieved user
        assertEquals(newUser, result);
    }

    @Test
    public void testShowUser_UserNotFound() {
        // Mocking UserRepository's findById method to return null
        when(userRepository.findById(1)).thenReturn(Optional.empty());

        // Attempting to show a non-existing user should return null
        User result = userService.showUser(1);

        assertEquals(null, result);
    }
    
    
    @Test
    public void testShowAllUsers_Success() {
        // Mocking user data
        List<User> userList = new ArrayList<>();
        
        User newUser1 = new User();
    	newUser1.setUser_id(1);
    	newUser1.setName("Kundan");
    	newUser1.setEmail("kundan@gmail.com");
    	newUser1.setMobile("1234567890");
    	newUser1.setAddress("ggn");
    	newUser1.setPassword("kundan123");
    	newUser1.setRole("user");
    	
    	User newUser2 = new User();
    	newUser2.setUser_id(1);
    	newUser2.setName("Kundan");
    	newUser2.setEmail("kundan@gmail.com");
    	newUser2.setMobile("1234567890");
    	newUser2.setAddress("ggn");
    	newUser2.setPassword("kundan123");
    	newUser2.setRole("user");
        
    	userList.add(newUser1);
    	userList.add(newUser2);
        // Mocking UserRepository's findAll method
        when(userRepository.findAll()).thenReturn(userList);

        // Retrieving all users
        List<User> result = userService.showAllUsers();

        // Asserting the retrieved user list
        assertEquals(userList.size(), result.size());
        assertEquals(userList, result);
    }
}
