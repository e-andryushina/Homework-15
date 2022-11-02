package transport;

public class Bus extends Transport {
    public Bus(String carBrand, String carModel, int releaseYear, String country, String color, int maxSpeed) {
        super(carBrand, carModel, releaseYear, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправить бензином или дизелем на заправке.");
    }

    @Override
    public String toString() {
        return "Bus " + getCarBrand() +
                ", CarModel: " + getCarModel() +
                ", ReleaseYear: " + getReleaseYear() +
                ", Country: " + getCountry() +
                ", Max Speed: " + maxSpeed;
    }
}
