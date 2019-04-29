package com.hank.hankInterviewQuestion.Generation;

import com.hank.hankInterviewQuestion.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsGeneration {

    public List<Student> studentsIdGeneration(int num){
        List<Student> students = new ArrayList<>();
        for(int x = 0; x < num;x++){
            students.add(new Student(x));
        }
        return students;

    }

}
