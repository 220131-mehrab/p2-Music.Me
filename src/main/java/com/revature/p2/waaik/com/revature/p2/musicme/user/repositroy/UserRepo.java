package com.revature.p2.waaik.com.revature.p2.musicme.user.repositroy;

import com.revature.p2.waaik.com.revature.p2.musicme.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
    User findByUserId(UUID id);
    User findByUserName(String fname, String lname);
}
