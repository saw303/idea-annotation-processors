package ch.silviowangler.mapstruct;

public class ApplicationModule2 {

    public static void main(String[] args) {
        CarMapper mapper = new CarMapperImpl();

        mapper.toCarDto(new Car());
    }
}
