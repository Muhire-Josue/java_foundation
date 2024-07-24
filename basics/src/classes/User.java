package classes;

import exceptions.InvalidAgeException;

public class User {

    private String name;
    private Integer age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
