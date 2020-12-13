package javaorikamapperexample;

import java.util.Date;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class MyCustomConverter extends CustomConverter<Date, MyCustomDate> {

	
	public MyCustomDate convert(Date date, Type<? extends MyCustomDate> destinationType,
			MappingContext mappingContext) {
		MyCustomDate myCustomDate = new MyCustomDate();
		myCustomDate.setDateOfBirthDay(date.getDate());
		myCustomDate.setDateOfBirthMonth(date.getMonth());
		myCustomDate.setDateOfBirthYear(date.getYear());
		return myCustomDate;
	}

}