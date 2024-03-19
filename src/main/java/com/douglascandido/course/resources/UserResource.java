package com.douglascandido.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglascandido.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
	User user = new User(1l, "Douglas", "douglas@gmail.com", "9999", "0000");
	return ResponseEntity.ok().body(user);
    }
}
