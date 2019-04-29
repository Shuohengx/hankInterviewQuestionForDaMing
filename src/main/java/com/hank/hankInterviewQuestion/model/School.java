package com.hank.hankInterviewQuestion.model;

import com.hank.hankInterviewQuestion.model.Class;

import java.util.ArrayList;
import java.util.List;

public class School {
    int schoolId;
    List<Class> classList = new ArrayList<>();

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }

    public School(int schoolId) {
        this.schoolId = schoolId;
    }
}
