package ch.silviowangler.mapstruct;

import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {

    CarDTO toCarDto(Car car);
}
