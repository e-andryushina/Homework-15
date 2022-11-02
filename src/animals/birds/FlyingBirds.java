package animals.birds;

public class FlyingBirds extends Birds {

    public FlyingBirds(String name, int age, String habitat, String typeOfMovement) {
        super(name, age, habitat, typeOfMovement);
    }

    public String toString() {
        return getClass() + super.toString();
    }

    @Override
    public void go() {
        System.out.println("Летать");
    }
}
