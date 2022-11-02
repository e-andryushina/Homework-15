package animals.birds;

import animals.Animals;
import transport.ValidationUtils;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String typeOfMovement;

    public Birds(String name, int age, String habitat, String typeOfMovement) {
        super(name, age, habitat);
        this.typeOfMovement = ValidationUtils.validOrDefault(typeOfMovement, "default");
    }

    private void hunt () {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                "} " + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("Питаться мелкими грызунами/ рыбой/ зерновыми");
    }

    @Override
    public abstract void go();

    public String getTypeOfMovement() {
        return typeOfMovement;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return typeOfMovement.equals(birds.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
