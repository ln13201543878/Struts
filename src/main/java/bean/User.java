package bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
     private Integer uid;
	 private String uname;
	 private Date birthday;
	 private double umoney;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getUmoney() {
		return umoney;
	}
	public void setUmoney(double umoney) {
		this.umoney = umoney;
	}
	public User(Integer uid, String uname, Date birthday, double umoney) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.birthday = birthday;
		this.umoney = umoney;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", birthday=" + birthday + ", umoney=" + umoney + "]";
	}
	 
}
