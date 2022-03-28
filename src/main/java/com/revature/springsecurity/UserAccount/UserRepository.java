package com.revature.springsecurity.UserAccount;

import org.springframework.data.jpa.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//CRUDRepository extending interface for User type

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
     User findByEmail(String email);
     User findByConfirmationToken(String confirmationToken);
}