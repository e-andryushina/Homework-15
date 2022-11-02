package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    public double engineVolume;
    public String transmission;
    private final String bodyType;
    public String regNumber;
    private final int seatsCount;
    public boolean winterTires;
    private final Key key;
    private final Insurance insurance;


    public Car(String carBrand, String carModel, double engineVolume,
               String color, int releaseYear, String country, String transmission, String bodyType,
               String registrationNumber, int seatsCount, boolean winterTires, Key key,
               Insurance insurance, int maxSpeed) {
        super (carBrand, carModel, releaseYear,country,color,maxSpeed);
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        this.bodyType = ValidationUtils.validOrDefault(bodyType,"default");;
        setRegistrationNumber(registrationNumber);
        this.seatsCount = seatsCount > 0 ? seatsCount : 4;
        this.winterTires = winterTires;
        this.key = key;
        this.insurance = insurance;
    }

    public void changeTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth >= 11 || currentMonth >= 4;
    }

    public boolean isRegNumberValid () {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isLetter(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumber(regNumberChars[4])
                && isLetter(regNumberChars[5])
                && isLetter(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8])
                && isNumber(regNumberChars[9]);
    }

    private boolean isNumber (char number) {
        return number >= 0 && number <= 9;
    }

    private boolean isLetter (char letter) {
        String allowedLetters = "АВСЕКМНОРСТУК";
        return allowedLetters.contains("" + letter);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = Math.abs(engineVolume);
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        }
        this.color = "Черный";
    }

    @Override
    public void refill() {
        if (getBodyType().equals("Электрокар")) {
            System.out.println("Зарядить на специальных электропарковках");
        }
        else {
            System.out.println("Заправить бензином, дизелем на заправке");
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isBlank() && !transmission.isEmpty()) {
            this.transmission = transmission;
        }
        this.transmission = "Автомат";
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isBlank() && !registrationNumber.isEmpty()) {
            this.regNumber = registrationNumber;
        }
        this.regNumber = "х000хх000";
    }


    @Override
    public String toString() {
        return "Car:" + getCarBrand() + getCarModel() + '\'' +
                "Engine Volume: " + engineVolume +
                "Color: " + color + '\'' +
                "Release Year: " + getReleaseYear() +'\''+
                "Country: " + getCountry() + '\'' +
                "Transmission: " + transmission + '\'' +
                "Body Type: " + bodyType + '\'' +
                "Registration Number: " + regNumber + '\'' +
                "Seats Count: " + seatsCount + '\'' +
                "Winter Tires: " + winterTires + '\'';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && getReleaseYear() == car.getReleaseYear() && seatsCount == car.seatsCount && Objects.equals(getCarBrand(), car.getCarBrand()) && Objects.equals(getCarModel(), car.getColor()) && Objects.equals(color, car.color) && Objects.equals(getCountry(), car.getCountry()) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(regNumber, car.regNumber) && Objects.equals(winterTires, car.winterTires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarBrand(), getCarModel(), engineVolume, color, getReleaseYear(), getCountry(), transmission, bodyType, regNumber, seatsCount, winterTires);
    }


    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;


        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean getRemoteStart() {
            return remoteStart;
        }

        public boolean getKeylessEntry() {
            return keylessEntry;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final double insuranceCost;
        private final String insuranceNumber;

        public Insurance(LocalDate validUntil, double insuranceCost, String insuranceNumber) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(21);
            this.insuranceCost = Math.max(insuranceCost, 1);
            this.insuranceNumber = ValidationUtils.validOrDefault(insuranceNumber, "default");
        }

          public boolean isNumberValid () {
            return insuranceNumber.length() == 9;
        }

        public boolean isInsuranceValid () {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }


}


