package entities;

public class Customer {
	private String firstName;
	private String lastName;
	private int id;
	private String nationalityId;
	private String dateOfBirth;

	public Customer() {

	}

	public Customer(String firstName, String lastName, int id, String nationalityId, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
