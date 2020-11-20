package xyz.nekotori.nekoweb.entity;

import java.io.Serializable;
import java.util.Date;

public class ArticleDetailsDo implements Serializable {
    private Long id;

    private String topic;

    private String author;

    private Date createTime;

    private String description;

    private String imgUrl;

    private Integer numbers;

    private Long origin;

    private Integer state;

    private String title;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public ArticleDetailsDo withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public ArticleDetailsDo withTopic(String topic) {
        this.setTopic(topic);
        return this;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getAuthor() {
        return author;
    }

    public ArticleDetailsDo withAuthor(String author) {
        this.setAuthor(author);
        return this;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ArticleDetailsDo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public ArticleDetailsDo withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public ArticleDetailsDo withImgUrl(String imgUrl) {
        this.setImgUrl(imgUrl);
        return this;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getNumbers() {
        return numbers;
    }

    public ArticleDetailsDo withNumbers(Integer numbers) {
        this.setNumbers(numbers);
        return this;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Long getOrigin() {
        return origin;
    }

    public ArticleDetailsDo withOrigin(Long origin) {
        this.setOrigin(origin);
        return this;
    }

    public void setOrigin(Long origin) {
        this.origin = origin;
    }

    public Integer getState() {
        return state;
    }

    public ArticleDetailsDo withState(Integer state) {
        this.setState(state);
        return this;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public ArticleDetailsDo withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public ArticleDetailsDo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        ArticleDetailsDo other = (ArticleDetailsDo) that;
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
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topic=").append(topic);
        sb.append(", author=").append(author);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", numbers=").append(numbers);
        sb.append(", origin=").append(origin);
        sb.append(", state=").append(state);
        sb.append(", title=").append(title);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}