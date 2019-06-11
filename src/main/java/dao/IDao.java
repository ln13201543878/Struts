package dao;

import java.util.List;

import bean.User;

public interface IDao {
void save(User u);
void delete(Integer uid);
void update(User u);
User findOne(Integer uid);
List<User> findAll();
}
