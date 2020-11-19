package xyz.nekotori.nekoweb.service.impl;

import cn.hutool.core.date.DateTime;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import xyz.nekotori.nekoweb.common.util.PasswordHash;
import xyz.nekotori.nekoweb.converter.user.UserDtoConverter;
import xyz.nekotori.nekoweb.dao.UserDao;
import xyz.nekotori.nekoweb.entity.UserDo;
import xyz.nekotori.nekoweb.model.dto.UserDto;
import xyz.nekotori.nekoweb.service.UserService;

/**
 * Author: Dengjay Date: 2020/11/18 Time: 14:30
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDtoConverter userDtoConverter;

    @Resource
    UserDao userDao;

    @Override
    public void insertUser(UserDto userDto) {
        userDto.setIsActive(true);
        userDto.setLevel(1);
        userDto.setCreatTime(new Date());
        UserDo userDo = userDtoConverter.targetToSource(userDto);
        userDo.setPasswordHashed(PasswordHash.encode(userDto.getPassword()));
        userDao.insertUserInfo(userDo);
    }
}
