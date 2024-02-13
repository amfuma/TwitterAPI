package com.cooksys.social_media.mappers;

import com.cooksys.social_media.dtos.ProfileDto;
import com.cooksys.social_media.entities.Profile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileDto entityToDto(Profile profile);

    List<ProfileDto> entitiesToDtos(List<Profile> profiles);

    Profile dtoToEntity(ProfileDto profileDto);
    
}
