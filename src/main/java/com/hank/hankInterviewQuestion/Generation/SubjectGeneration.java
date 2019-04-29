package com.hank.hankInterviewQuestion.Generation;

import com.hank.hankInterviewQuestion.model.Student;
import com.hank.hankInterviewQuestion.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectGeneration {
    public List<Subject> subjectIdGeneration(int num){
        List<Subject> subjects = new ArrayList<>();
        for(int x = 0; x < num;x++){
            //  Student student = new Student(num);
            subjects.add(new Subject(x));
        }
        return  subjects;
    }
}
