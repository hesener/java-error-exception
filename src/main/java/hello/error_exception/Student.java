package hello.error_exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer grade;
}
