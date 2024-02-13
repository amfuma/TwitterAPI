package com.cooksys.social_media.dtos;
import java.sql.Timestamp;

import lombok.*;

@NoArgsConstructor
@Data
public class HashtagDto {
	
	private String label;

	private Timestamp firstUsed;

	private Timestamp lastUsed;	

}
