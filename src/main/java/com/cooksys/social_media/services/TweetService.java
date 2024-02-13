package com.cooksys.social_media.services;

import java.util.List;

import com.cooksys.social_media.dtos.*;

public interface TweetService {

    List<TweetResponseDto> getAllTweets();

    TweetResponseDto createTweet(TweetRequestDto tweetRequestDto);

    TweetResponseDto getTweetWithId(Long id);

    TweetResponseDto deleteTweet(CredentialsDto credentialsDto, Long id);

    void likeTweet(CredentialsDto credentialDto, Long id);

    TweetResponseDto replyToTweet(TweetRequestDto tweetRequestDto, Long id);

    TweetResponseDto repostTweet(CredentialsDto credentialsDto, Long id);

    List<HashtagDto> getAllTagsOnPost(Long id);

    List<UserResponseDto> getAllUsersWhoLikeThisTweet(Long id);

    ContextDto getContextOfTweet(Long id);

    List<TweetResponseDto> getRepliesToTweet(Long id);

    List<TweetResponseDto> getRepostsOfTweet(Long id);

    List<UserResponseDto> getUsersInTweet(Long id);

}
