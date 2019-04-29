package com.hank.hankInterviewQuestion.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    int teacherId;
    int subjectId;
    List<Class> classes = new ArrayList<>();

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

}
