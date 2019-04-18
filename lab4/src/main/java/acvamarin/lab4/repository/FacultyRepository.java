package acvamarin.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import acvamarin.lab4.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

	Faculty findByphone(String name);

	Faculty findByName(String name);

}
