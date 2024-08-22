package io.github.Ital023.backend_Smileship.dto;

import io.github.Ital023.backend_Smileship.entities.User;

public record UserDTO(Long id, String username,String password ,String email, String firstName, String surname) {

    public UserDTO(User entity) {
        this(
                entity.getId(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getEmail(),
                entity.getFirstName(),
                entity.getSurname()
        );
    }

}
