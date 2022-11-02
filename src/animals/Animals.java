package animals;

import transport.ValidationUtils;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;
    private String habitat;


    public Animals(String name, int age, String habitat) {
        this.name = ValidationUtils.validOrDefault(name,"default");
        this.age = age >= 0 ? age : Math.abs(age);
        this.habitat = ValidationUtils.validOrDefault(habitat, "default");
    }

    public abstract void eat();

    private void sleep () {
        System.out.println("Спать");
    }

    public abstract void go ();

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name) && habitat.equals(animals.habitat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, habitat);
    }
}
