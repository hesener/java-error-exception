package hello.error_exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ApiResponse<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ApiResponse<>(ErrorCode.OK.getCode(), "성공", students);
    }

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse<Object> handleCustomException(CustomException ex) {
        return new ApiResponse<>(ex.getErrorCode().getCode(), ex.getMessage(), ex.getData());
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ApiResponse<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return new ApiResponse<>(ErrorCode.OK.getCode(), "Student created successfully", createdStudent);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public ApiResponse<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id, student);
        return new ApiResponse<>(ErrorCode.OK.getCode(), "Student updated successfully", updatedStudent);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ApiResponse<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return new ApiResponse<>(ErrorCode.OK.getCode(), "Student deleted successfully", null);
    }

}

