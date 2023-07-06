package com.kas.repository.impl;

import com.kas.entity.Student;
import com.kas.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",23));
        studentMap.put(3L,new Student(3L,"王五",24));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }
    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }
    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }
    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
