package com.web.doru.service;

import com.web.doru.DAO.StudentDAO;
import com.web.doru.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class StudentService {
    private final StudentDAO studentDao;


    @Autowired
    public StudentService(@Qualifier("fakeDAO") StudentDAO studentDao) {

        this.studentDao = studentDao;
    }

    public int persistNewStudent(UUID studentId, Student student) {

        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;

        student.setId(studentId);

        return studentDao.insertNewStudent(studentUid, student);

    }


    public Student getStudentById(UUID studentId) {
        return studentDao.selectStudentById(studentId);

    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return studentDao.updateStudentById(studentId, studentUpdate);

    }


    public int deleteStudentById(UUID studentId) {
        return studentDao.deleteStudentById(studentId);

    }

}

