package com.cooksys.social_media.dtos;

import java.util.List;

import lombok.*;

@NoArgsConstructor
@Data
public class ContextDto {	
	
	 private TweetResponseDto target;

	 private List<TweetResponseDto> before;

	 private List<TweetResponseDto> after;	 

}
