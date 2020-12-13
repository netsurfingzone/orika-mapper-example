package javaorikamapperexample;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrikaConfig extends ConfigurableMapper {

	protected void configure(MapperFactory factory) {

		factory.classMap(Student.class, StudentDto.class).byDefault().register();
		ConverterFactory converterFactory = factory.getConverterFactory();
		converterFactory.registerConverter(new MyCustomConverter());
	}
}
