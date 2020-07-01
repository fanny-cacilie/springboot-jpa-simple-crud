package com.users.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.users.sa.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

}
