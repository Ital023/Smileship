package io.github.Ital023.backend_Smileship.services;

import io.github.Ital023.backend_Smileship.dto.UserDTO;
import io.github.Ital023.backend_Smileship.entities.User;
import io.github.Ital023.backend_Smileship.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO save(UserDTO dto) {

        User entity = copyDtoToEntity(dto);

        User obj = repository.save(entity);
        return new UserDTO(obj);
    }



    private User copyDtoToEntity(UserDTO dto) {
        User user = new User();

        user.setUsername(dto.username());
        user.setPassword(dto.password());
        user.setEmail(dto.email());
        user.setFirstName(dto.firstName());
        user.setSurname(dto.surname());

        return user;
    }


}
