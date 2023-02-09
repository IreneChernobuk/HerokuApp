package Tests;

import com.github.javafaker.Faker;

public class FakerMessageGenerate {
    public static String generateValue() {
        Faker faker = new Faker();
        return faker.numerify("######");
    }
}