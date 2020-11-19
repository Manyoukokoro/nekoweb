package xyz.nekotori.nekoweb.model.dto;

import java.util.Date;
import lombok.Data;

/**
 * Author: Dengjay Date: 2020/11/18 Time: 14:31
 */
@Data
public class UserDto {
    private Long id;

    private String userName;

    private String password;

    private Date creatTime;

    private String firstName;

    private String lastName;

    private Date updateTime;

    private Boolean isActive;

    private String eMail;

    private String location;

    private Integer level;

    private Date forbidUntil;

}
