package io.github.Ital023.backend_Smileship.repositories;

import io.github.Ital023.backend_Smileship.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
