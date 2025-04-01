package com.demo.controllers;

import com.demo.controllers.UserController;
import com.demo.models.User;
import com.demo.services.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService service;

    @InjectMocks
    private UserController controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getUserTest() {
        // Arrange
        User mockUser = new User();
        mockUser.setId("31");
        mockUser.setName("John Doe");
        mockUser.setEmail("john.doe@example.com");

        when(service.get("31")).thenReturn(mockUser);

        // Act
        User result = controller.get(null, "31");

        // Assert
        assertNotNull(result);
        assertEquals("31", result.getId());
        assertEquals("John Doe", result.getName());
        assertEquals("john.doe@example.com", result.getEmail());

        verify(service).get("31");
    }

    @Test
    public void removeTest() {
        // Act
        controller.remove(null, "12");

        // Assert
        verify(service).remove("12");
    }

    @Test
    public void removeManyTest() {
        // Arrange
        String[] ids = {"31", "11", "22"};

        // Act
        controller.removeMany(null, ids);

        // Assert
        verify(service, times(ids.length)).remove(any());
    }

    @Test
    public void getUserObjectTest() {
        // Arrange
        User userMock = new User();
        userMock.setEmail("test@test.com");
        userMock.setId("31");
        userMock.setName("test");
        userMock.setPassword("f2j83fj23f");

        when(service.get(any())).thenReturn(userMock);

        // Act
        User user = controller.get(null, "31");

        // Assert
        assertNotNull(user);
        assertEquals("31", user.getId());
        assertEquals("test@test.com", user.getEmail());
        assertEquals("test", user.getName());
    }

    @Test
    public void getUserTestShouldThrowErrorIfIsNull() {
        // Arrange
        when(service.get(null)).thenThrow(new IllegalArgumentException("ID no tiene que ser nulo"));

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> controller.get(null, null)
        );

        assertEquals("ID no tiene que ser nulo", exception.getMessage());
    }

}







