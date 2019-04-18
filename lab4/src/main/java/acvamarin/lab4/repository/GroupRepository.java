package acvamarin.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import acvamarin.lab4.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

	Group findByName(String name);

}
