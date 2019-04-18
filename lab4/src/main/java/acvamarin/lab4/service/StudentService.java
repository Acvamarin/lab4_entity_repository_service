package acvamarin.lab4.service;

import java.util.List;

import acvamarin.lab4.entity.Student;

public interface StudentService extends Service<Student> {

	List<Student> readByGroupId(Long groupId);

	List<Student> readBySurname(String surname);

}
