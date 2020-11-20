package xyz.nekotori.nekoweb.entity;

import java.io.Serializable;
import java.util.Date;

public class ArticleDo implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public ArticleDo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public ArticleDo withKeyword(String keyword) {
        this.setKeyword(keyword);
        return this;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getLikes() {
        return likes;
    }

    public ArticleDo withLikes(String likes) {
        this.setLikes(likes);
        return this;
    }

    public void setLikes(String likes) {
        this.likes = likes == null ? null : likes.trim();
    }

    public Integer getState() {
        return state;
    }

    public ArticleDo withState(Integer state) {
        this.setState(state);
        return this;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public ArticleDo withCategoryId(Integer categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ArticleDo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public ArticleDo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAuthor() {
        return author;
    }

    public ArticleDo withAuthor(String author) {
        this.setAuthor(author);
        return this;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getIsActive() {
        return isActive;
    }

    public ArticleDo withIsActive(Integer isActive) {
        this.setIsActive(isActive);
        return this;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getArticleDetailsId() {
        return articleDetailsId;
    }

    public ArticleDo withArticleDetailsId(Long articleDetailsId) {
        this.setArticleDetailsId(articleDetailsId);
        return this;
    }

    public void setArticleDetailsId(Long articleDetailsId) {
        this.articleDetailsId = articleDetailsId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ArticleDo other = (ArticleDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getArticleDetailsId() == null ? other.getArticleDetailsId() == null : this.getArticleDetailsId().equals(other.getArticleDetailsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getArticleDetailsId() == null) ? 0 : getArticleDetailsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keyword=").append(keyword);
        sb.append(", likes=").append(likes);
        sb.append(", state=").append(state);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", author=").append(author);
        sb.append(", isActive=").append(isActive);
        sb.append(", articleDetailsId=").append(articleDetailsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}