package javaorikamapperexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ma.glasnost.orika.MapperFacade;

public class OrikaExample {
	public static void main(String[] args) throws ParseException {
		MapperFacade facade = new OrikaConfig();

		Student s = new Student();
		s.setName("jack");
		s.setId("1");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1980-07-26");
		s.setDateOfBirth(date);
		StudentDto studentDto = facade.map(s, StudentDto.class);
		System.out.println(studentDto.getName());
		System.out.println(studentDto.getId());
		System.out.println(studentDto.getDateOfBirth().getDateOfBirthDay());
		System.out.println(studentDto.getDateOfBirth().getDateOfBirthMonth());
		System.out.println(studentDto.getDateOfBirth().getDateOfBirthYear());
	}
}
