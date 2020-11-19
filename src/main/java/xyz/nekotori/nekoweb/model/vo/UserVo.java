package xyz.nekotori.nekoweb.model.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Author: Dengjay Date: 2020/11/18 Time: 14:45
 */
@Data
public class UserVo {

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("e_mail")
    private String eMail;

    @JsonProperty("location")
    private String location;
}
