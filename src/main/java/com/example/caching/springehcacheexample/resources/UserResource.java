package com.example.caching.springehcacheexample.resources;

import com.example.caching.springehcacheexample.cache.UsersCache;
import com.example.caching.springehcacheexample.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @Autowired
    public UsersCache usersCache;

    @GetMapping(value="/rest/search/{name}")
    public Users getUsers(@PathVariable final String name ){
            return usersCache.getUsers(name);
    }
}
