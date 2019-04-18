package acvamarin.lab4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import acvamarin.lab4.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByGroupId(Long id);

	List<Student> findBySurname(String name);

}
