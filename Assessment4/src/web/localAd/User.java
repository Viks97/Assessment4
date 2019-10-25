package web.localAd;

public class User {
	private String name;
	private String email;
	private String phone;
	private String city;
	private String zipCode;
	
	
	public User(String name, String email, String phone, String city, String zipCode) {
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.city=city;
		this.zipCode=zipCode;
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	}
	


