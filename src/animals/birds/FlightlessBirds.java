package animals.birds;

import animals.Animals;

public class FlightlessBirds extends Birds {
    public FlightlessBirds(String name, int age, String habitat, String typeOfMovement) {
        super(name, age, habitat, typeOfMovement);
    }



    private void walk () {
        System.out.println("Гулять");
    }


    public String toString() {
        return getClass() + super.toString();
    }

    @Override
    public void go() {
        System.out.println("Ходить по земле/ плавать на воде");
    }



}
