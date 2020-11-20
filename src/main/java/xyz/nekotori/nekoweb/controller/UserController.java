package xyz.nekotori.nekoweb.controller;

import cn.hutool.http.HttpStatus;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.nekotori.nekoweb.common.constant.MessageConstants;
import xyz.nekotori.nekoweb.common.response.CommonResponse;
import xyz.nekotori.nekoweb.common.result.ErrorResult;
import xyz.nekotori.nekoweb.converter.user.UserVoConverter;
import xyz.nekotori.nekoweb.model.dto.UserDto;
import xyz.nekotori.nekoweb.model.vo.UserVo;
import xyz.nekotori.nekoweb.service.UserService;

/**
 * Author: Dengjay Date: 2020/11/18 Time: 14:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @Resource
    UserVoConverter userVoConverter;

    @PostMapping
    public CommonResponse insertUser(@RequestBody UserVo userVo){
        UserDto userDto = userVoConverter.targetToSource(userVo);
        try{
        userService.insertUser(userDto);
        return CommonResponse.ok(HttpStatus.HTTP_ACCEPTED);
        }catch (Exception e){

            ErrorResult result = new ErrorResult();
            result.setErrorCode(String.valueOf(HttpStatus.HTTP_INTERNAL_ERROR));
            result.setErrorMessage(MessageConstants.INTERNAL_ERROR);
        return CommonResponse.error(result);
        }

    }
}
