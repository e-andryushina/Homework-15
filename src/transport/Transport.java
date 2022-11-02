package transport;

import transport.ValidationUtils;

public abstract  class Transport {

    private final String carBrand;
    private final String carModel;
    private final int releaseYear;
    private final String country;
    public String color;
    public int maxSpeed;

    public Transport(String carBrand, String carModel,
                     int releaseYear, String country,
                     String color, int maxSpeed) {
        this.carBrand = ValidationUtils.validOrDefault(carBrand, "default");
        this.carModel = ValidationUtils.validOrDefault(carModel, "default");
        this.releaseYear = releaseYear > 0 ? releaseYear : 1900;
        this.country = ValidationUtils.validOrDefault(country, "default");
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        }
        this.color = "Черный";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
        else {
            maxSpeed = 200;
        }
    }

    public abstract void refill();
}
