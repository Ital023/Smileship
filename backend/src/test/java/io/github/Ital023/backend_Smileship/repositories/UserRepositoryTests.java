package io.github.Ital023.backend_Smileship.repositories;

import io.github.Ital023.backend_Smileship.entities.User;
import io.github.Ital023.backend_Smileship.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalUsers;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 100000L;
        countTotalUsers = 3L;
    }

    @Test
    public void saveUserShouldPersistWithAutoIncrementWhenIdIsNull(){
        User user = Factory.createUser();
        user.setId(null);

        user = repository.save(user);

        Assertions.assertNotNull(user.getId());
        Assertions.assertEquals(countTotalUsers + 1, user.getId());
    }

    @Test
    public void findByIdShouldReturnUserWhenIdExists() {
        Optional<User> user = repository.findById(existingId);


        Assertions.assertTrue(user.isPresent());
        Assertions.assertEquals(existingId, user.get().getId());
    }

    @Test
    public void findByIShouldDoNotReturnUserWhenIdDoesNotExists(){
        Optional<User> user = repository.findById(nonExistingId);

        Assertions.assertTrue(user.isEmpty());
    }

    @Test
    public void deleteShouldDeleteUserWhenIdExist(){
        repository.deleteById(existingId);

        Optional<User> user = repository.findById(existingId);
        Assertions.assertTrue(user.isEmpty());
    }


}
