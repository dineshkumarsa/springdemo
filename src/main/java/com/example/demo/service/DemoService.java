package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

@Autowired
    DemoRepository demoRepository;

    public List<User> getAllCustomers() {
        return (List<User>)demoRepository.findAll();
    }

    public User getUserById(int id){
        return demoRepository.findById(id).get();
    }
    public void saveUserDetails(User user){
        demoRepository.save(user);
    }

}
