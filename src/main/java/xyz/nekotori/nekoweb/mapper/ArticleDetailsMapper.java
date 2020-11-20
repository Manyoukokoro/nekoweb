package xyz.nekotori.nekoweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xyz.nekotori.nekoweb.entity.ArticleDetailsDo;
import xyz.nekotori.nekoweb.entity.ArticleDetailsDoExample;
import xyz.nekotori.nekoweb.entity.ArticleDetailsDoWithBLOBs;

@Mapper
public interface ArticleDetailsMapper {
    long countByExample(ArticleDetailsDoExample example);

    int deleteByExample(ArticleDetailsDoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleDetailsDoWithBLOBs record);

    int insertSelective(ArticleDetailsDoWithBLOBs record);

    List<ArticleDetailsDoWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ArticleDetailsDoExample example, RowBounds rowBounds);

    List<ArticleDetailsDoWithBLOBs> selectByExampleWithBLOBs(ArticleDetailsDoExample example);

    List<ArticleDetailsDo> selectByExampleWithRowbounds(ArticleDetailsDoExample example, RowBounds rowBounds);

    List<ArticleDetailsDo> selectByExample(ArticleDetailsDoExample example);

    ArticleDetailsDoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleDetailsDoWithBLOBs record, @Param("example") ArticleDetailsDoExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleDetailsDoWithBLOBs record, @Param("example") ArticleDetailsDoExample example);

    int updateByExample(@Param("record") ArticleDetailsDo record, @Param("example") ArticleDetailsDoExample example);

    int updateByPrimaryKeySelective(ArticleDetailsDoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleDetailsDoWithBLOBs record);

    int updateByPrimaryKey(ArticleDetailsDo record);
}