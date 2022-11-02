package animals.mammals;

public class Herbivores extends Mammals {

    public Herbivores(String name, int age, String habitat, int speed, String typeOfMeal) {
        super(name, age, habitat, speed, typeOfMeal);
    }

    public void graze() {
        System.out.println("Пастись");
    }

    public String toString() {
        return getClass() + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("Есть траву");
    }
}
