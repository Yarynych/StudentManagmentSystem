package ua.yarynych.studentsmanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.yarynych.studentsmanagmentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
