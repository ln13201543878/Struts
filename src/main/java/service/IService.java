package service;

import java.util.List;

import bean.User;

public interface IService {
	void add(User u);
	void delete(Integer uid);
	void edit(User u);
	User getOne(Integer uid);
	List<User> getAll();
}
