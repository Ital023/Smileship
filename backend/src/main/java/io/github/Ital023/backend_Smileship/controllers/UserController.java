package io.github.Ital023.backend_Smileship.controllers;

import io.github.Ital023.backend_Smileship.dto.UserDTO;
import io.github.Ital023.backend_Smileship.dto.UserMinDTO;
import io.github.Ital023.backend_Smileship.entities.User;
import io.github.Ital023.backend_Smileship.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO dto) {
        UserDTO entityDto = service.save(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(entityDto.id())
                .toUri();

        return ResponseEntity.created(uri).body(entityDto);
    }

    @GetMapping
    public List<UserMinDTO> findAll() {
        return service.findAll();
    }



}
