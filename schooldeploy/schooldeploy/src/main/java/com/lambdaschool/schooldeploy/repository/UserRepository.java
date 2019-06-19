package com.lambdaschool.schooldeploy.repository;

import com.lambdaschool.schooldeploy.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}