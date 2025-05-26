package org.mercurion.userservice.service;

import org.mercurion.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(long id);
    List<UserDTO> getAllUsers();
    void deleteUser(long id);
}
