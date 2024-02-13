package com.cooksys.social_media.mappers;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.entities.Credentials;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {

    CredentialsDto entityToDto(Credentials credentials);

    Credentials dtoToEntity(CredentialsDto credentialsDto);

}
