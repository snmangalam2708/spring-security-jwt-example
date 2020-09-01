package com.sandeep.springsecurityjwtexample.repository;

import com.sandeep.springsecurityjwtexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
