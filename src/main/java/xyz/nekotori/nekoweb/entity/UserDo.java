package xyz.nekotori.nekoweb.entity;

import java.io.Serializable;
import java.util.Date;

public class UserDo implements Serializable {
    private Long id;

    private String firstName;

    private String lastName;

    private Date creatTime;

    private Date updateTime;

    private Boolean isActive;

    private String userName;

    private String eMail;

    private String passwordHashed;

    private String location;

    private Integer level;

    private Date forbidUntil;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public UserDo withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDo withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public UserDo withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public UserDo withCreatTime(Date creatTime) {
        this.setCreatTime(creatTime);
        return this;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public UserDo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public UserDo withIsActive(Boolean isActive) {
        this.setIsActive(isActive);
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getUserName() {
        return userName;
    }

    public UserDo withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public UserDo witheMail(String eMail) {
        this.seteMail(eMail);
        return this;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public UserDo withPasswordHashed(String passwordHashed) {
        this.setPasswordHashed(passwordHashed);
        return this;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed == null ? null : passwordHashed.trim();
    }

    public String getLocation() {
        return location;
    }

    public UserDo withLocation(String location) {
        this.setLocation(location);
        return this;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public UserDo withLevel(Integer level) {
        this.setLevel(level);
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getForbidUntil() {
        return forbidUntil;
    }

    public UserDo withForbidUntil(Date forbidUntil) {
        this.setForbidUntil(forbidUntil);
        return this;
    }

    public void setForbidUntil(Date forbidUntil) {
        this.forbidUntil = forbidUntil;
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
        UserDo other = (UserDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.geteMail() == null ? other.geteMail() == null : this.geteMail().equals(other.geteMail()))
            && (this.getPasswordHashed() == null ? other.getPasswordHashed() == null : this.getPasswordHashed().equals(other.getPasswordHashed()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getForbidUntil() == null ? other.getForbidUntil() == null : this.getForbidUntil().equals(other.getForbidUntil()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((geteMail() == null) ? 0 : geteMail().hashCode());
        result = prime * result + ((getPasswordHashed() == null) ? 0 : getPasswordHashed().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getForbidUntil() == null) ? 0 : getForbidUntil().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isActive=").append(isActive);
        sb.append(", userName=").append(userName);
        sb.append(", eMail=").append(eMail);
        sb.append(", passwordHashed=").append(passwordHashed);
        sb.append(", location=").append(location);
        sb.append(", level=").append(level);
        sb.append(", forbidUntil=").append(forbidUntil);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}