package xyz.nekotori.nekoweb.model.vo;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * Author: Dengjay Date: 2020/11/20 Time: 15:56
 */
@Data
@Builder
public class ArticleVo {
    private Integer id;

    private String keyword;

    private String likes;

    private Integer state;

    private Integer categoryId;

    private String author;

    private Integer isActive;

    private Long articleDetailsId;
}
