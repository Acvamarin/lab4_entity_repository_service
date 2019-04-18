package acvamarin.lab4.service;

import acvamarin.lab4.entity.Faculty;

public interface FacultyService extends Service<Faculty> {

	Faculty readByName(String name);

	Faculty readByphone(String name);

}
