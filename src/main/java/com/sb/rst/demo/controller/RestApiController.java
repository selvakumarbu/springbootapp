package com.sb.rst.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.rst.demo.model.User;

@RestController
@RequestMapping("/api")
public class RestApiController {
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> getUser() {
        //List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setName("nazeer");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	@RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("nazeer");
        User user2 = new User();
        user2.setId(2);
        user2.setName("madhu");
        users.add(user1);
        users.add(user2);
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
