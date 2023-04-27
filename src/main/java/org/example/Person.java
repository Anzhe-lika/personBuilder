package org.example;
import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public boolean hasAge() {
        if (age < 0 && age > 150) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasAddress() {
        if (address == null && address.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String city) {
        this.address = city;
    }
    public void happyBirthday() {
        age++;
    }
    @Override
    public String toString() {
        return  "Имя: " + name +
                "\n Фамилия: " + surname +
                "\n Возраст: " + age +
                "\n Город: " + address + ";";
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setName(this.name)
                .setSurname(getSurname())
                .setAge(this.age)
                .setAddress(getAddress());
    }
}