package com.cooksys.social_media.mappers;

import com.cooksys.social_media.dtos.TweetRequestDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.entities.Tweet;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TweetMapper {

    TweetResponseDto entityToDto(Tweet tweet);

    List<TweetResponseDto> entitiesToDtos(List<Tweet> tweets);

    Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto);

    Tweet dtoToEntity(TweetResponseDto tweetResponseDto);
    
}
