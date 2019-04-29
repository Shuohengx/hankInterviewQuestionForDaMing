package com.hank.hankInterviewQuestion.Generation;

import com.hank.hankInterviewQuestion.model.Class;
import com.hank.hankInterviewQuestion.model.School;

import java.util.ArrayList;
import java.util.List;

public class ClassGeneration {

    public List<Class> classGenerate(int num){
        List<Class> classes = new ArrayList<>();
        for(int classId = 0; classId < num;classId++){
            Class class1 = new Class(classId);
            classes.add(class1);
        }
        return classes;

    }
}
