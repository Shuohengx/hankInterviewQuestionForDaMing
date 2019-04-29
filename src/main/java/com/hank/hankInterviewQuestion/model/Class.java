package com.hank.hankInterviewQuestion.model;

import java.util.ArrayList;
import java.util.List;

public class Class {
    List<Student> students = new ArrayList<>();
    int classId;



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Class(int classId) {
        this.classId = classId;
    }
}
