package xyz.nekotori.nekoweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xyz.nekotori.nekoweb.entity.UserDo;
import xyz.nekotori.nekoweb.entity.UserDoExample;

@Mapper
public interface UserMapper {
    long countByExample(UserDoExample example);

    int deleteByExample(UserDoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    List<UserDo> selectByExampleWithRowbounds(UserDoExample example, RowBounds rowBounds);

    List<UserDo> selectByExample(UserDoExample example);

    UserDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByExample(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}