package com.hank.hankInterviewQuestion.Generation;

import com.hank.hankInterviewQuestion.model.School;
import com.hank.hankInterviewQuestion.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolGeneration {
    public List<School> SchoolIdGeneration(int num){
        List<School> schools = new ArrayList<>();
        for(int schoolId = 0; schoolId < num;schoolId++){
            schools.add(new School(schoolId));
        }
        return schools;

    }
}
