package xyz.nekotori.nekoweb.dao;

import cn.hutool.core.util.ObjectUtil;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import xyz.nekotori.nekoweb.entity.ArticleDo;
import xyz.nekotori.nekoweb.entity.UserDo;
import xyz.nekotori.nekoweb.mapper.ArticleMapper;

/**
 * Author: Dengjay Date: 2020/11/20 Time: 15:28
 */
@Repository
public class ArticleDao {
    @Resource
    ArticleMapper articleMapper;

    public boolean insertArticle(ArticleDo user){
        if(ObjectUtil.isNull(user)) return false;
        return articleMapper.insert(user) == 1;
    }
}
