package com.teste.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
