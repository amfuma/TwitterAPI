package com.cooksys.social_media.dtos;

import lombok.*;

@NoArgsConstructor
@Data
public class TweetRequestDto {
	
	private String content;
	
	private CredentialsDto credentials;
		
}
