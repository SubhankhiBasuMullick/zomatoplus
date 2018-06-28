package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.User;

public interface UserRepositories extends JpaRepository<User, Long>{
User findByUsernameAndPassword(String name,String password);
}
