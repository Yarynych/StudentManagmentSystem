package ua.yarynych.studentsmanagmentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.yarynych.studentsmanagmentsystem.entity.Student;
import ua.yarynych.studentsmanagmentsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentsManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentsManagmentSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {


//         Student student1 = new Student("Bruce", "Wayne", "IamBatman@gmail.com");
//         studentRepository.save(student1);
//
//         Student student2 = new Student("Peter", "Parker", "SpiderMan@gmail.com");
//         studentRepository.save(student2);
//
//         Student student3 = new Student("Tony", "Stark", "ironMan@gmail.com");
//         studentRepository.save(student3);



    }
}
