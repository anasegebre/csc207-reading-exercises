
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;

	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.id        = id;
		this.age       = age;
	}

	/**
	 * Gets the firstName of the student.
	 *
	 * @return the firstName.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Gets the lastName of the student.
	 *
	 * @return the lastName.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the id of the student.
	 *
	 * @return the id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the age of the student.
	 *
	 * @return the age.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the firstName of the student. This string must not be empty.
	 *
	 * @param firstName the new, non-empty firstName of the student.
	 * @throws IllegalArgumentException if a null or empty string is given.
	 */
	public void setFirstName(String firstName) {
		if (firstName.equals(null) || firstName.contentEquals("")) {
			throw new IllegalArgumentException();
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * Sets the lastName of the student. This string must not be empty.
	 *
	 * @param lastName the new, non-empty lastName of the student.
	 * @throws IllegalArgumentException if a null or empty string is given.
	 */
	public void setLastName(String lastName) {
		if (lastName.equals(null) || lastName.contentEquals("")) {
			throw new IllegalArgumentException();
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * Sets the id of the student. This id should be 5 digits.
	 *
	 * @param id the new, 5-digit id of the student.
	 * @throws IllegalArgumentException if the id is not 5 digits long.
	 */
	public void setId(int id) {
		int length = String.valueOf(id).length();
		if (length == 5) {
			this.id = id;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the age of the student. The age must be greater than 0.
	 *
	 * @param age the new, greater-than-0 age of the student.
	 * @throws IllegalArgumentException if the given age is 0 or less.
	 */
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
