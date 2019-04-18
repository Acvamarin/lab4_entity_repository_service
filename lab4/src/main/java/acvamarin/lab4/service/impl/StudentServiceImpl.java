package acvamarin.lab4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acvamarin.lab4.entity.Student;
import acvamarin.lab4.repository.StudentRepository;
import acvamarin.lab4.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student read(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Student> read() {
		return repository.findAll();
	}

	@Override
	public List<Student> readByGroupId(Long groupId) {
		return repository.findByGroupId(groupId);
	}

	@Override
	public List<Student> readBySurname(String surname) {
		return repository.findBySurname(surname);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);

	}

	@Override
	public void save(Student entity) {
		repository.save(entity);

	}

}
