package com.example.caching.springehcacheexample.cache;

import com.example.caching.springehcacheexample.entity.Users;
import com.example.caching.springehcacheexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UsersCache {

    @Autowired
    public UserRepository userRepository;

    @Cacheable(value = "usersCache", key="#name")
    public Users getUsers(String name){
        System.out.print("retrieving from Database !!!! for name"+name);
        return userRepository.findByName(name);
    }
}
