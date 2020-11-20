package xyz.nekotori.nekoweb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xyz.nekotori.nekoweb.entity.ArticleDo;
import xyz.nekotori.nekoweb.entity.ArticleDoExample;

@Mapper
public interface ArticleMapper {
    long countByExample(ArticleDoExample example);

    int deleteByExample(ArticleDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleDo record);

    int insertSelective(ArticleDo record);

    List<ArticleDo> selectByExampleWithRowbounds(ArticleDoExample example, RowBounds rowBounds);

    List<ArticleDo> selectByExample(ArticleDoExample example);

    ArticleDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleDo record, @Param("example") ArticleDoExample example);

    int updateByExample(@Param("record") ArticleDo record, @Param("example") ArticleDoExample example);

    int updateByPrimaryKeySelective(ArticleDo record);

    int updateByPrimaryKey(ArticleDo record);
}