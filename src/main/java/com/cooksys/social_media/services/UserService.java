package com.cooksys.social_media.services;

import java.util.List;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.dtos.UserRequestDto;
import com.cooksys.social_media.dtos.UserResponseDto;

public interface UserService {

    List<UserResponseDto> getAllUsers();

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(String username);

    UserResponseDto updateUser(String username, UserRequestDto userRequestDto);

    UserResponseDto deleteUser(String username, CredentialsDto credentialsDto);

    void followUser(String username, CredentialsDto credentialsDto);
    
    void unfollowUser(String username, CredentialsDto credentialsDto);

    List<TweetResponseDto> getUserFeed(String username);

    List<TweetResponseDto> getUserTweets(String username);

    List<TweetResponseDto> getUserMentions(String username);

    List<UserResponseDto> getUserFollowers(String username);

    List<UserResponseDto> getUserFolloweringUser(String username);

}
