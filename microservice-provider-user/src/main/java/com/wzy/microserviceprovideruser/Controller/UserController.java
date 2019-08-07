package com.wzy.microserviceprovideruser.Controller;

import com.wzy.microserviceprovideruser.Entity.User;
import com.wzy.microserviceprovideruser.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return  this.userRepository.getOne(id);
    }
}
