package com.hank.hankInterviewQuestion.model;

public class Student {
    private int id;
    private int classId;
    private int schoolId;


    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getSchoolId() {
        return schoolId;
    }
}

