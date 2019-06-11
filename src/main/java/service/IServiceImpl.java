package service;

import java.util.List;

import bean.User;
import dao.IDaoFactory;

public class IServiceImpl implements IService {

	@Override
	public void add(User u) {
		IDaoFactory.getIDaoImpl().save(u);
	}

	@Override
	public void delete(Integer uid) {
		IDaoFactory.getIDaoImpl().delete(uid);
	}

	@Override
	public void edit(User u) {
		IDaoFactory.getIDaoImpl().update(u);
	}

	@Override
	public User getOne(Integer uid) {
		return IDaoFactory.getIDaoImpl().findOne(uid);
	}

	@Override
	public List<User> getAll() {
		return IDaoFactory.getIDaoImpl().findAll();
	}

}
