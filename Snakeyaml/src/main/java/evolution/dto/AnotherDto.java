package evolution.dto;

public class AnotherDto {
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "AnotherDto [gender=" + gender + "]";
	}
}
