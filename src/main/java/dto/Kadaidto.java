package dto;

public class Kadaidto {
	private int id;
	private String name;
	private String age;
	private String seibetu;
	private String number;
	private String email;
	private String salt;
	private String password;
	private String hashedPassword;
	
	public Kadaidto( int id,String name, String age, String seibetu,String number,String email,String salt, String password, String hashedPassword) {
		super();
		this.id = id;
		this.name = name;
		this.age= age;
		this.seibetu = seibetu;
		this.number= number;
		this.email= email;
		this.salt=salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
	}
	
	public int getId() {
		return id;
	}
	
	public void setid(int id){
		this.id =id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSeibetu() {
		return seibetu;
	}

	public void setSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt){
		this.salt = salt;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
	return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
	this.hashedPassword = hashedPassword;
	}
}
