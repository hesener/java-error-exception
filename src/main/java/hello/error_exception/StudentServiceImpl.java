package hello.error_exception;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private final Map<Long, Student> studentRepository = new HashMap<>();

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentRepository.values());
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.get(id);
    }

    @Override
    public Student createStudent(Student student) {
        // 여기서 입력값 검증 및 학생 생성 로직을 추가합니다.
        return student;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        // 학생 정보 업데이트 로직을 추가합니다.
        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        // 학생 삭제 로직을 추가합니다.
    }
}
