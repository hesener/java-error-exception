package hello.error_exception;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;
    private final Object data;

    public CustomException(ErrorCode errorCode, String message, Object data) {
        super(message);
        this.errorCode = errorCode;
        this.data = data;
    }
}
