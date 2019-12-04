package io.wangler.mapstruct;

public class ApplicationModule1 {

    public static void main(String[] args) {
        PersonMapper mapper = new PersonMapperImpl();

        mapper.toPersonDto(new Person());

    }
}
