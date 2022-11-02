package animals.mammals;

public class Predators extends Mammals {

    public Predators(String name, int age, String habitat, int speed, String typeOfMeal) {
        super(name, age, habitat, speed, typeOfMeal);
    }

    public void hunt () {
        System.out.println("Охотиться");
    }

    public String toString() {
        return getClass() + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("Питаться травоядными");
    }
}