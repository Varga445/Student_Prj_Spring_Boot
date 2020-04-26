package com.web.doru.DAO;
import com.web.doru.Model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDAO {
    int insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentById(UUID studentId, Student studentUpdate);

    int deleteStudentById(UUID studentId);

}
