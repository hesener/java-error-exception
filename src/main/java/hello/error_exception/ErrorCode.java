package hello.error_exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    OK(2000, "정상 처리되었습니다"),
    SERVER_ERROR(5000, "서버 내부 오류");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}