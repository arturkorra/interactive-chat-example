package com.example.interactive.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.interactive.chat.model.User;

/**
 *
 * @author Artur Korra
 */
public interface UserRepository extends JpaRepository<User, String> {
	User findBynickName(String nickName);
}
