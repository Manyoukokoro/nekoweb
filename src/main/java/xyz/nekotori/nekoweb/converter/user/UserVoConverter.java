package xyz.nekotori.nekoweb.converter.user;

import org.mapstruct.Mapper;
import xyz.nekotori.nekoweb.converter.BaseConverter;
import xyz.nekotori.nekoweb.model.dto.UserDto;
import xyz.nekotori.nekoweb.model.vo.UserVo;

@Mapper(componentModel = "spring")
public interface UserVoConverter extends BaseConverter<UserDto, UserVo> {

}
