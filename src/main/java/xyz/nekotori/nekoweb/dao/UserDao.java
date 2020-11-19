package xyz.nekotori.nekoweb.dao;

import cn.hutool.core.util.ObjectUtil;
import java.util.List;
import javax.annotation.Resource;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xyz.nekotori.nekoweb.entity.UserDo;
import xyz.nekotori.nekoweb.entity.UserDoExample;
import xyz.nekotori.nekoweb.mapper.UserMapper;

/**
 * Author: Dengjay Date: 2020/11/18 Time: 14:23
 */
@Repository
public class UserDao {

    @Resource
    UserMapper userMapper;

    public boolean insertUserInfo(UserDo user){
        if(ObjectUtil.isNull(user)) return false;
        return userMapper.insert(user) == 1;
    }

    public boolean updateUserInfo(UserDo user){
        if(ObjectUtil.isNull(user)) return false;
        return userMapper.updateByPrimaryKey(user) == 1;
    }

    public List<UserDo> selectUserInfoByUserName(String userName){
        UserDoExample example = new UserDoExample();
        example.createCriteria().andUserNameLike("%"+userName+"%");
        return userMapper.selectByExample(example);
    }

    public UserDo selectUserInfoById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
