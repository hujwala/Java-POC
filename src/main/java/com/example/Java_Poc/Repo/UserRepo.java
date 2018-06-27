package com.example.Java_Poc.Repo;

import com.example.Java_Poc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
