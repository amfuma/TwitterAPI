package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.repositories.HashtagRepository;
import com.cooksys.social_media.repositories.UserRepository;
import com.cooksys.social_media.services.ValidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidateServiceImpl implements ValidateService {

	private final HashtagRepository hashTagRepository;
	private final UserRepository userRepository;

	@Override
	public boolean doesTagExist(String label) {
		return hashTagRepository.existsByLabel(label);
	}

	@Override
	public boolean doesUsernameExist(String username) {		
		return userRepository.existsByCredentials_Username(username);
	}

	@Override
	public boolean isUsernameAvailable(String username) {
		if (userRepository.existsByCredentialsUsernameAndDeletedFalse(username)) {
			return false;
		}
		return true;
	}
}
