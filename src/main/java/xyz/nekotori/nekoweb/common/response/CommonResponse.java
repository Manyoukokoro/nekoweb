package xyz.nekotori.nekoweb.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import xyz.nekotori.nekoweb.common.result.ErrorResult;

/**
 * @author aegis
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResponse<T> {

    private int code;

    private String message;

    private T data;


    public static <T> CommonResponse<T> ok(T data) {
        return new CommonResponse<T>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    public static <T> CommonResponse<T> ok() {
        return new CommonResponse<T>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), null);
    }

    public static CommonResponse<ErrorResult> error(ErrorResult result) {
        return new CommonResponse<>(result.getStatus(), result.getErrorMessage(), result);
    }

    public static CommonResponse<ErrorResult> error(HttpStatus httpStatus) {
        return new CommonResponse<>(httpStatus.value(), httpStatus.getReasonPhrase(), null);
    }
}
