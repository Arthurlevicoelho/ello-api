package com.ello.br.ello.controllers;

import com.ello.br.ello.models.ResponseModel;
import com.ello.br.ello.models.entitys.UserEntity;
import com.ello.br.ello.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserEntity, UUID> {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super(userService);

        this.userService = userService;
    }

    @GetMapping("/find")
    public ResponseEntity<ResponseModel> findByName(@RequestParam String userName) {
        return userService.findByName(userName);
    }

    @PostMapping
    public ResponseEntity<ResponseModel> post(@RequestBody @Validated UserEntity user) {
        return userService.save(user);
    }

    @PutMapping
    public ResponseEntity<ResponseModel> put(@RequestBody @Validated UserEntity user) {
        return userService.put(user);
    }
    
}
