package com.example.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user){// thêm mới 1 user
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){// thêm mới nhiều user
        return repository.saveAll(users);
    }

    public List<User> getUsers(){// trả về list User
        return repository.findAll();
    }

    public User getUserById(String id){
        return repository.findById(id).orElse(null);
    }

    public String deleteUserById(String id){
        repository.deleteById(id);
        return "Deleted Successful Id: "+id;
    }

    public User updateUser(User user){
        User xx = repository.findById(user.getId()).orElse(null);
        xx.setName(user.getName());
        xx.setAge(user.getAge());
        xx.setGender(user.isGender());
        return repository.save(xx);
    }


}
