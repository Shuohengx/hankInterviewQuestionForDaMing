package com.hank.hankInterviewQuestion.Distrubution;

import com.hank.hankInterviewQuestion.model.Class;
import com.hank.hankInterviewQuestion.model.School;
import com.hank.hankInterviewQuestion.model.Student;

import java.util.List;

public class StudentDistribution {

    public void classDistribute(List<Student> students,List<School> schools) {
        int index = 0;
        while(index < students.size())
            for(School school:schools){
                students.get(index).setSchoolId(school.getSchoolId());
                index++;
            }
        }
}
