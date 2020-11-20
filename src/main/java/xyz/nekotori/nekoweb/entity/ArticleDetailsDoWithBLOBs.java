package xyz.nekotori.nekoweb.entity;

import java.io.Serializable;

public class ArticleDetailsDoWithBLOBs extends ArticleDetailsDo implements Serializable {
    private String category;

    private String comments;

    private String content;

    private String keyword;

    private String likeUsers;

    private String meta;

    private String tags;

    private static final long serialVersionUID = 1L;

    public String getCategory() {
        return category;
    }

    public ArticleDetailsDoWithBLOBs withCategory(String category) {
        this.setCategory(category);
        return this;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getComments() {
        return comments;
    }

    public ArticleDetailsDoWithBLOBs withComments(String comments) {
        this.setComments(comments);
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getContent() {
        return content;
    }

    public ArticleDetailsDoWithBLOBs withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public ArticleDetailsDoWithBLOBs withKeyword(String keyword) {
        this.setKeyword(keyword);
        return this;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getLikeUsers() {
        return likeUsers;
    }

    public ArticleDetailsDoWithBLOBs withLikeUsers(String likeUsers) {
        this.setLikeUsers(likeUsers);
        return this;
    }

    public void setLikeUsers(String likeUsers) {
        this.likeUsers = likeUsers == null ? null : likeUsers.trim();
    }

    public String getMeta() {
        return meta;
    }

    public ArticleDetailsDoWithBLOBs withMeta(String meta) {
        this.setMeta(meta);
        return this;
    }

    public void setMeta(String meta) {
        this.meta = meta == null ? null : meta.trim();
    }

    public String getTags() {
        return tags;
    }

    public ArticleDetailsDoWithBLOBs withTags(String tags) {
        this.setTags(tags);
        return this;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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
        ArticleDetailsDoWithBLOBs other = (ArticleDetailsDoWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getNumbers() == null ? other.getNumbers() == null : this.getNumbers().equals(other.getNumbers()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getLikeUsers() == null ? other.getLikeUsers() == null : this.getLikeUsers().equals(other.getLikeUsers()))
            && (this.getMeta() == null ? other.getMeta() == null : this.getMeta().equals(other.getMeta()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getNumbers() == null) ? 0 : getNumbers().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getLikeUsers() == null) ? 0 : getLikeUsers().hashCode());
        result = prime * result + ((getMeta() == null) ? 0 : getMeta().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", category=").append(category);
        sb.append(", comments=").append(comments);
        sb.append(", content=").append(content);
        sb.append(", keyword=").append(keyword);
        sb.append(", likeUsers=").append(likeUsers);
        sb.append(", meta=").append(meta);
        sb.append(", tags=").append(tags);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}