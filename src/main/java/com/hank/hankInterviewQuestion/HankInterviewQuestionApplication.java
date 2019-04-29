package com.hank.hankInterviewQuestion;

import com.hank.hankInterviewQuestion.Distrubution.StudentDistribution;
import com.hank.hankInterviewQuestion.Generation.ClassGeneration;
import com.hank.hankInterviewQuestion.Generation.SchoolGeneration;
import com.hank.hankInterviewQuestion.Generation.StudentsGeneration;
import com.hank.hankInterviewQuestion.Generation.SubjectGeneration;
import com.hank.hankInterviewQuestion.model.Class;
import com.hank.hankInterviewQuestion.model.School;
import com.hank.hankInterviewQuestion.model.Student;
import com.hank.hankInterviewQuestion.model.Subject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HankInterviewQuestionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HankInterviewQuestionApplication.class, args);

		//产生

		StudentsGeneration studentsGeneration = new StudentsGeneration();
		List<Student> studentList = studentsGeneration.studentsIdGeneration(200);

		SchoolGeneration schoolGeneration = new SchoolGeneration();
		List<School> schools = schoolGeneration.SchoolIdGeneration(10);

		ClassGeneration classGeneration = new ClassGeneration();
		List<Class> classes = classGeneration.classGenerate(100);

		SubjectGeneration subjectGeneration = new SubjectGeneration();
		List<Subject> subjects = subjectGeneration.subjectIdGeneration(5);


		//---------------------------------------------------------
		//分配学生
		StudentDistribution studentDistribution = new StudentDistribution();
		studentDistribution.classDistribute(studentList,schools);







	}

}
