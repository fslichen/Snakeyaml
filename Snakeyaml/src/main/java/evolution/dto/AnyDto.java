package evolution.dto;

import java.util.List;

public class AnyDto {
	private String name;
	private List<String> addresses;
	private List<AnotherDto> anotherDtos;
	private TheOtherDto theOtherDto;

	public List<String> getAddresses() {
		return addresses;
	}

	public List<AnotherDto> getAnotherDtos() {
		return anotherDtos;
	}

	public String getName() {
		return name;
	}

	public TheOtherDto getTheOtherDto() {
		return theOtherDto;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public void setAnotherDtos(List<AnotherDto> anotherDtos) {
		this.anotherDtos = anotherDtos;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTheOtherDto(TheOtherDto theOtherDto) {
		this.theOtherDto = theOtherDto;
	}
	
	@Override
	public String toString() {
		return "AnyDto [name=" + name + ", addresses=" + addresses + ", anotherDtos=" + anotherDtos + "]";
	}
}
