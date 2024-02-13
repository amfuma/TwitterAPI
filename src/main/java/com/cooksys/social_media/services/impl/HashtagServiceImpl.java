package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.HashtagDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.mappers.HashtagMapper;
import com.cooksys.social_media.mappers.TweetMapper;
import com.cooksys.social_media.repositories.HashtagRepository;
import com.cooksys.social_media.repositories.TweetRepository;
import com.cooksys.social_media.entities.Tweet;
import com.cooksys.social_media.services.HashtagService;
import com.cooksys.social_media.exceptions.NotFoundException;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {
	
	private final HashtagMapper hashTagMapper;
	private final TweetMapper tweetMapper;
	
	private final HashtagRepository hashTagRepository;
	private final TweetRepository tweetRepository;
	
    @Override
    public List<HashtagDto> getAllHashtags() {
    	return hashTagMapper.entitiesToDtos(hashTagRepository.findAll());        
    }

    @Override
    public List<TweetResponseDto> getAllTweetsWithHashtag(String label) {
		List<String> listOfTags = new ArrayList<>();
		for (HashtagDto h : getAllHashtags()) {
			listOfTags.add(h.getLabel());
		}
		if (!listOfTags.contains(label)){
			throw new NotFoundException("Label does not exist!");
		}
    	List<Tweet> allTweets = tweetRepository.findAllByDeletedFalseOrderByPostedDesc();
    	
    	List<TweetResponseDto> tweetsWithTag = new ArrayList<>();
    	
    	for(Tweet tweet : allTweets) {
    		if(tweet.getContent().contains(label)) {
    			tweetsWithTag.add(tweetMapper.entityToDto(tweet));
    		}    		
    	}
        return tweetsWithTag;
    }
}
