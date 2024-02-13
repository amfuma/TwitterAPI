package com.cooksys.social_media.dtos;
import lombok.*;

@NoArgsConstructor
@Data
public class UserRequestDto {

	private CredentialsDto credentials;
	
	private ProfileDto profile;
	
}
