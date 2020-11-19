package xyz.nekotori.nekoweb.common.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
/**
 * @author aegis
 * @date 2019-06-20 23:34
 * 异常返回体
 */
@Data
public class ErrorResult {

    /**
     * HTTP状态码 200  4xx 业务异常 5xx服务器
     */
    private int status;

    /**
     * ErrorCodeEnum
     */
    private String errorCode;

    /**
     * 前端需要展示 Exception.getMessage()
     */
    private String errorMessage;

    /**
     * ErrorDisplayTypeEnum，前端异常展示的样式
     */
    private String displayType;

    /**
     * 时间戳
     */
    private String timestamp;

    /**
     * request url
     */
    private String path;

    /**
     * 异常详细情况
     */
    @JsonIgnore
    private String details;

    /**
     * 用户导致的异常
     */
    private boolean userError;
}
