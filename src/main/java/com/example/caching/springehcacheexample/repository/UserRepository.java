package com.example.caching.springehcacheexample.repository;

import com.example.caching.springehcacheexample.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    public Users findByName(String name);
}
