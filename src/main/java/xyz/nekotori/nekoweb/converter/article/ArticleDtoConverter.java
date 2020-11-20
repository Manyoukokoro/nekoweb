package xyz.nekotori.nekoweb.converter.article;

import org.mapstruct.Mapper;
import xyz.nekotori.nekoweb.converter.BaseConverter;
import xyz.nekotori.nekoweb.entity.ArticleDo;
import xyz.nekotori.nekoweb.model.dto.ArticleDto;

/**
 * Author: Dengjay Date: 2020/11/20 Time: 15:57
 */
@Mapper(componentModel = "spring")
public interface ArticleDtoConverter extends BaseConverter<ArticleDo, ArticleDto> {

}
