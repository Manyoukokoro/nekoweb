package xyz.nekotori.nekoweb.model.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * Author: Dengjay Date: 2020/11/20 Time: 15:53
 */
@Data
@Builder
public class ArticleDto {
    private Integer id;

    private String keyword;

    private String likes;

    private Integer state;

    private Integer categoryId;

    private Date createTime;

    private Date updateTime;

    private String author;

    private Integer isActive;

    private Long articleDetailsId;
}
