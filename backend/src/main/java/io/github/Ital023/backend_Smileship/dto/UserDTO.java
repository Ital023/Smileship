package io.github.Ital023.backend_Smileship.dto;

import io.github.Ital023.backend_Smileship.entities.User;
import jakarta.validation.constraints.NotBlank;


public record UserDTO(    Long id,
                          @NotBlank(message = "O campo de username não pode ser vazio")
                          String username,
                          @NotBlank(message = "O campo de senha não pode ser vazio")
                          String password ,
                          @NotBlank(message = "O campo de email não pode ser vazio")
                          String email,
                          @NotBlank(message = "O campo de nome não pode ser vazio")
                          String firstName,
                          String surname,
                          String imgUrl) {

    public UserDTO(User entity) {
        this(
                entity.getId(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getEmail(),
                entity.getFirstName(),
                entity.getSurname(),
                entity.getImgUrl()
        );
    }

}
