package com.example.caching.springehcacheexample.loader;

import com.example.caching.springehcacheexample.entity.Users;
import com.example.caching.springehcacheexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Loader {

    @Autowired
    public UserRepository userRepository;

    @PostConstruct
    public void load(){
        List<Users> usersList = getUserList();
        userRepository.saveAll(usersList);
    }

    private List<Users> getUserList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users(1L, "priyank"));
        usersList.add(new Users(2L, "parveen"));
        usersList.add(new Users(3L, "Arjun"));

        return usersList;
    }
}
