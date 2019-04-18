package acvamarin.lab4.service;

import acvamarin.lab4.entity.Group;

public interface GroupService extends Service<Group> {

	Group readByName(String name);

}
