package org.example;
public class Main {
    public static void main(String... args) {
        Person mom = new PersonBuilder()
                .setName("Аннэт")
                .setSurname("Вольф")
                .setAge(35)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Артемий")
                .setSurname(mom.getSurname())
                .setAge(5)
                .setAddress(mom.getAddress())
                .build();

        System.out.println("У " + mom.name + " есть сын, "+ son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().setName("Аннэт").setSurname("Вольф").build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            // Возраст недопустимый
            new PersonBuilder().setName("Аннэт").setSurname("Вольф").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}