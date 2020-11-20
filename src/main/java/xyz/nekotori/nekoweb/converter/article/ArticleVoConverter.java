package xyz.nekotori.nekoweb.converter.article;

import org.mapstruct.Mapper;
import xyz.nekotori.nekoweb.converter.BaseConverter;
import xyz.nekotori.nekoweb.model.dto.ArticleDto;
import xyz.nekotori.nekoweb.model.vo.ArticleVo;

@Mapper(componentModel = "spring")
public interface ArticleVoConverter extends BaseConverter<ArticleDto, ArticleVo> {

}
