package transport;

import java.sql.Time;
import java.util.Objects;

public class Train extends Transport {

    public int rideCost;
    public String departureStation;
    public String endingStation;
    public int amountOfWagons;

    public Train(String carBrand, String carModel, int releaseYear,
                 String country, String color, int maxSpeed, int rideCost,
                 String departureStation, String endingStation, int amountOfWagons) {
        super(carBrand, carModel, releaseYear, country, color, maxSpeed);
        this.rideCost = rideCost;
        this.departureStation = departureStation;
        this.endingStation = endingStation;
        this.amountOfWagons = amountOfWagons;
    }

    public int getRideCost() {
        return rideCost;
    }

    public void setRideCost(int rideCost) {
        if (rideCost > 0) {
            this.rideCost = rideCost;
        } else if (rideCost < 0){
            this.rideCost = Math.abs(rideCost);
        }
        else {
            this.rideCost = 5000;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        ValidationUtils.validOrDefault(departureStation, "default");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        ValidationUtils.validOrDefault(endingStation, "default");
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        if (amountOfWagons > 0) {
            this.amountOfWagons = amountOfWagons;
        } else if (amountOfWagons < 0){
            this.amountOfWagons = Math.abs(amountOfWagons);
        }
        else {
            this.amountOfWagons = 10;
        }
    }

    @Override
    public String toString() {
        return "Train "+ super.getCarBrand() +
                ", carModel: " + super.getCarModel() +
                ", releaseYear: " + super.getReleaseYear() +
                ", maxSpeed: " + maxSpeed +
                ", departureStation: " + departureStation +
                ", endingStation: " + endingStation +
                ", rideCost: " + rideCost +
                ", amountOfWagons: " + amountOfWagons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return rideCost == train.rideCost && amountOfWagons == train.amountOfWagons && Objects.equals(departureStation, train.departureStation) && Objects.equals(endingStation, train.endingStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rideCost, departureStation, endingStation, amountOfWagons);
    }

    @Override
    public void refill() {
        System.out.println("Заправить дизелем");
    }
}


