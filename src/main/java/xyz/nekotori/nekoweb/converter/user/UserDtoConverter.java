package xyz.nekotori.nekoweb.converter.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import xyz.nekotori.nekoweb.converter.BaseConverter;
import xyz.nekotori.nekoweb.entity.UserDo;
import xyz.nekotori.nekoweb.model.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserDtoConverter extends BaseConverter<UserDo, UserDto> {

    @Override
    @Mapping(source = "eMail", target = "EMail")
    UserDto sourceToTarget(UserDo var1);
}
