package com.kushlav.spring_data_jpa_ex;

import com.kushlav.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Lav");
//		s1.setMarks(87);
//
//		s2.setRollNo(102);
//		s2.setName("Kush");
//		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("Arun");
//		s3.setMarks(89);

//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(103));

//		Optional<Student> s = repo.findById(104);
//		System.out.println(s.orElse(context.getBean(Student.class)));

//		System.out.println(repo.findByName("Kush"));
//		System.out.println(repo.findByMarksGreaterThan(83));

//		Update AND Delete
//		repo.save(s2);
//		repo.delete(s2);
	}

}
