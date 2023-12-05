package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

public class UserControllerTest {

    private UserController userController;
    private Model model;

    @Test
    public void testAddUser() {
        userController = new UserController();
        model = mock(Model.class);

        User userToAdd = new User();
        userToAdd.setFirstName("AddMePlease!");

        userController.addUser(userToAdd, model);
    
        assertTrue(UserController.getUserList().contains(userToAdd));
    }

    @Test
    public void testRemoveUser() {
        userController = new UserController();
    
        User userToRemove = new User();
        userToRemove.setFirstName("RemoveMePlease");
        
        UserController.getUserList().add(userToRemove);
        UserController.removeMember("RemoveMePlease");
    
        assertFalse(UserController.getUserList().contains(userToRemove));
    }
}