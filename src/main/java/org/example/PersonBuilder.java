package org.example;
public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        if (age < 0 && age > 150) {
            throw new IllegalArgumentException("Некорректный возраст!");
        }
        if (name == null) {
            throw new IllegalArgumentException("Укажите имя!");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Укажите фамилию!");
        }
        return new Person(name, surname, age, address);
    }
}
