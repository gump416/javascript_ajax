package ezen.ajax;

public class User {
	private String id;
	private String pw;
	private int age;
	private String address;
	
	public User(String id, String pw, int age, String address) {
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
