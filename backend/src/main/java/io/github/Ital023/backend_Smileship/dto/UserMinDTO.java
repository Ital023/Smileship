package io.github.Ital023.backend_Smileship.dto;

import io.github.Ital023.backend_Smileship.entities.User;

public record UserMinDTO(
            String username,
            String firstName,
            String surname,
            String imgUrl
    ) {

    public UserMinDTO(User entity) {
        this(
                entity.getUsername(),
                entity.getFirstName(),
                entity.getSurname(),
                entity.getImgUrl()
        );
    }

}
