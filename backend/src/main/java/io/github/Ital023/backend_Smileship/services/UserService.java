package io.github.Ital023.backend_Smileship.services;

import io.github.Ital023.backend_Smileship.dto.UserDTO;
import io.github.Ital023.backend_Smileship.dto.UserMinDTO;
import io.github.Ital023.backend_Smileship.entities.User;
import io.github.Ital023.backend_Smileship.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public UserDTO save(UserDTO dto) {

        User entity = copyDtoToEntity(dto);

        entity = repository.save(entity);

        return new UserDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<UserMinDTO> findAll() {
        List<User> entities = repository.findAll();

        List<UserMinDTO> dto = entities
                .stream()
                .map(x -> new UserMinDTO(x)).toList();

        return dto;
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
