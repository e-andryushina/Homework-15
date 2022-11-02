package animals.amphibians;

import animals.Animals;

public class Amphibians extends Animals {

    public Amphibians(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void hunt () {
        System.out.println("Охотиться");
    }

    public String toString() {
        return getClass() + super.toString();
    }

    @Override
    public  void eat() {
        System.out.println("Питаться насекомыми");
    }

    @Override
    public void go() {
        System.out.println("Перемещаться как по земле, так и в воде");
    }
}
