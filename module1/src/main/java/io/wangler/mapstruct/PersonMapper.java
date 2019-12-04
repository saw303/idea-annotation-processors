package io.wangler.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(target = "name", expression = "java( person.getGivenName() + \" \" + person.getSurname())")
    PersonDTO toPersonDto(Person person);
}
