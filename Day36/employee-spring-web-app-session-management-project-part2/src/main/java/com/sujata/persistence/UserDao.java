package com.sujata.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {

	public Optional<User> getUserByUserNameAndPassword(String userName,String password);
}
