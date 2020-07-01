package com.users.sa.resources;

import java.util.List;

import com.users.sa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.users.sa.repository.UserRepository;
import com.users.sa.models.User;

@RestController
@RequestMapping(value="/sa")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User listUserById(@PathVariable(value="id") long id){
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/users")
    public void deleteUser(@RequestBody User user) {
        userRepository.delete(user);
    }

    @PutMapping("/users")
    public User updateeUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
