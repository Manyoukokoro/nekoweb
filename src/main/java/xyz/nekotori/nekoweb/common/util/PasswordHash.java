package xyz.nekotori.nekoweb.common.util;

import org.springframework.util.DigestUtils;
import xyz.nekotori.nekoweb.common.constant.GlobalConstants;

/**
 * Author: Dengjay Date: 2020/11/19 Time: 14:59
 */
public class PasswordHash {
    public static String encode(String password){
        String hashedPassword= DigestUtils.md5DigestAsHex((GlobalConstants.HASH_CODE +password).getBytes());
        return hashedPassword;
    }
}
