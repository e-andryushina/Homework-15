package animals.mammals;

import animals.Animals;
import transport.ValidationUtils;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String habitat;
    private int speed;
    private String typeOfMeal;


    public Mammals(String name, int age, String habitat, int speed, String typeOfMeal) {
        super(name, age, habitat);
        this.speed = speed > 0 ? speed : Math.abs(speed);
        this.typeOfMeal = ValidationUtils.validOrDefault(typeOfMeal, "default");
    }

    private void walk () {
        System.out.println("Гулять");
    }
    public void go() {
        System.out.println("Перемещатья на четырех лапах");
    }

    @Override
    public String toString() {
        return "{" +
                "habitat='" + habitat + '\'' +
                ", speed=" + speed +
                ", typeOfMeal='" + typeOfMeal + '\'' +
                "} " + super.toString();
    }

    @Override
    public abstract void eat();


    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public String getTypeOfMovement() {
        return typeOfMeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && habitat.equals(mammals.habitat) && typeOfMeal.equals(mammals.typeOfMeal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed, typeOfMeal);
    }
}
