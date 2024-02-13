package com.cooksys.social_media.dtos;

import java.sql.Timestamp;

import lombok.*;

@NoArgsConstructor
@Data
public class TweetResponseDto {

	private Long id;

    private UserResponseDto author;

    private Timestamp posted;

    private String content;

    private TweetResponseDto inReplyTo;

    private TweetResponseDto repostOf;

}
