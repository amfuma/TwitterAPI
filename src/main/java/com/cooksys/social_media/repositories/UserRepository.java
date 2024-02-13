package com.cooksys.social_media.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.social_media.entities.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByCredentials_Username(String username);

	Optional<User> findByCredentialsUsername(String username);

    boolean existsByCredentialsUsernameAndDeletedFalse(String username);

    boolean existsByCredentialsUsernameAndDeletedTrue(String username);

    List<User> findAllByDeletedFalse();

    User findByCredentials_Username(String username);

    Optional<User> findByCredentialsUsernameAndDeletedFalse(String username);

}
