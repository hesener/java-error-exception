package hello.error_exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor

public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;
}
