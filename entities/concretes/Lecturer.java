package entities.concretes;

public class Lecturer {
	
	private int id;
	private String firsName;
	private String lastName;
	
	private String nationalityId;
	
	public Lecturer() {
		super();
	}
	public Lecturer(int id, String firsName, String lastName, String nationalityId) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
