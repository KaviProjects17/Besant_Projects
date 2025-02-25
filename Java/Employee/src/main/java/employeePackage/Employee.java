package employeePackage;


public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String address;
	private String contactno;
	
	Employee(){
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setUsername(username);
		this.setPassword(password);
		this.setContactno(contactno);
		this.setAddress(address);
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
