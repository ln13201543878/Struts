package web;


import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bean.User;
import service.IServiceFactory;

public class UserAction extends ActionSupport implements ModelDriven{
	User u=new User();
	public String update() {
		IServiceFactory.getIServiceImpl().edit(u);
		return "findAll";
	}
	public String delete() {
		IServiceFactory.getIServiceImpl().delete(u.getUid());
		return "findAll";
	}
	public String save() {
		IServiceFactory.getIServiceImpl().add(u);
		return "findAll";
	}
	public String findOne() {
		u=IServiceFactory.getIServiceImpl().getOne(u.getUid());
		ServletActionContext.getRequest().setAttribute("u", u);
		return "edit";
	}
	public String findAll() {
		List<User>user=IServiceFactory.getIServiceImpl().getAll();
		ServletActionContext.getRequest().setAttribute("user", user);
		return "findUI";
	}
	@Override
	public Object getModel() {
		return u;
	}

}
