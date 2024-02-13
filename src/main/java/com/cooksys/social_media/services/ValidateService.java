package com.cooksys.social_media.services;

public interface ValidateService {

    boolean doesTagExist(String label);

    boolean doesUsernameExist(String username);

    boolean isUsernameAvailable(String username);

}
