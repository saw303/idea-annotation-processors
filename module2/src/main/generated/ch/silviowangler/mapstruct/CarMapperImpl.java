package ch.silviowangler.mapstruct;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-04T11:29:51+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO toCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setName( car.getName() );

        return carDTO;
    }
}
