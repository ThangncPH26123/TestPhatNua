package com.example.Controller;

import com.example.Entity.User;
import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
//        int valueId = user.getId();
//        String stringvalueID = String.valueOf(valueId);
//        int count = 4;
//        int doDaiSo0 = count - stringvalueID.length();
//        for (int i = 0;i<doDaiSo0;i++){
//            stringvalueID = "0" + stringvalueID;
//        }
//        user.setId();
        return userService.saveUser(user);
    }

    @PostMapping("/addusers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveUsers(users);
    }

    @GetMapping("/users")
    public List<User> findALLUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id){
        return userService.deleteUserById(id);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
