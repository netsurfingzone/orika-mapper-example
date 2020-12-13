package javaorikamapperexample;

public class StudentDto {
	private String name;
	private String id;
	private MyCustomDate dateOfBirth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MyCustomDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyCustomDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
