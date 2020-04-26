package com.web.doru.DAO;

import com.web.doru.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDAO")
public class StudentFakeDAO implements StudentDAO {

    private final Map<UUID, Student> datebase;


    public StudentFakeDAO() {
        datebase = new HashMap<>();

        UUID studentid = UUID.randomUUID();
        datebase.put(
                studentid, new Student(studentid, 14, "Aurel", "Lazar", "Matematica"));

    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {

        datebase.put(studentId, student);

        return 1;

    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return datebase.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {

        return new ArrayList<>(datebase.values());

    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {

        datebase.put(studentId, studentUpdate);

        return 1;

    }

    @Override
    public int deleteStudentById(UUID studentId) {

        datebase.remove(studentId);
        return 1;
    }
}
