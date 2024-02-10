package OOP;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double height;
    private String position;

    public Person(String name, int age, double height, String position) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && Objects.equals(name, person.name) && Objects.equals(position, person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, position);
    }
}
