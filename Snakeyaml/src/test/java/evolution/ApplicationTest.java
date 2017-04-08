package evolution;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import evolution.dto.AnotherDto;
import evolution.dto.AnyDto;
import evolution.dto.TheOtherDto;

public class ApplicationTest {
	@Test
	public void testWrite() {
		AnyDto anyDto = new AnyDto();
		// Set a plain field.
		anyDto.setName("Chen");
		// Set a list of strings.
		List<String> addresses = new LinkedList<>();
		addresses.add("Champaign");
		addresses.add("Urbanba");
		anyDto.setAddresses(addresses);
		// Set a list of DTOs.
		AnotherDto anotherDto = new AnotherDto();
		anotherDto.setGender("M");
		List<AnotherDto> anotherDtos = new LinkedList<>();
		anotherDtos.add(anotherDto);
		anyDto.setAnotherDtos(anotherDtos);
		// Set a DTO.
		TheOtherDto theOtherDto = new TheOtherDto();
		theOtherDto.setDate(new Date());
		anyDto.setTheOtherDto(theOtherDto);
		// Generate yml file. 
		Yml.write(anyDto, "/home/chen/Desktop/Playground/Data/Yml_Output.yml", true, new MyRepresenter(true, null).getRepresenter() , true);
	}
}
