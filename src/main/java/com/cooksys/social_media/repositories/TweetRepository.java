package com.cooksys.social_media.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.social_media.entities.Tweet;


@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

    List<Tweet> findByAuthorIdAndDeletedFalseOrderByPostedDesc(Long userId);

    List<Tweet> findAllByDeletedFalseOrderByPostedDesc();

	Optional<Tweet> findById(Long id);

	Optional<Tweet> findByIdAndDeletedFalse(Long id);

    List<Tweet> findAllByDeletedFalse();

}
