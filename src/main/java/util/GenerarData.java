package util;

import com.github.javafaker.Faker;


public class GenerarData {

    private  final Faker faker = new Faker();

    public String crearCorreo() {
        return  faker.name().username().concat("@yopmaiñ.com");
    }
    public String crearClave(){
        return  faker.dragonBall().character().concat(faker.number().digit()).concat(faker.harryPotter().house());
    }

}
