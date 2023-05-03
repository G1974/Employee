package gr.prog.dto;

public class EmployeeDTO {

	private int employeeNumber;
	private String name;
	private String Surname;
	private String married;
	private String sex;
	private String bornDate;
	private String address;
	private int addressNumber;
	private String postCode;
	private String mobile;
	private String email;
	private String position;
	private String nationality;
	
	
	
	
	public EmployeeDTO(){}
	
	
	
	public EmployeeDTO(int employeeNumber,String name,String surname, String married, String sex, String bornDate, String address, int addressNumber,
		
			String postCode, String mobile, String email, String position, String nationality ) {
		super();
		Surname = surname;
		this.married = married;
		this.sex = sex;
		this.bornDate = bornDate;
		this.address = address;
		this.addressNumber = addressNumber;
		this.postCode = postCode;
		this.mobile = mobile;
		this.email = email;
		this.position = position;
		this.nationality = nationality;
		this.employeeNumber = employeeNumber;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBornDate() {
		return bornDate;
	}
	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
}
