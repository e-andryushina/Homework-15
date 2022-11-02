import animals.amphibians.Amphibians;
import animals.birds.FlightlessBirds;
import animals.birds.FlyingBirds;
import animals.mammals.Herbivores;
import animals.mammals.Predators;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Car ladaGranta = new Car("Lada",
                "Granta", 1.7,
                "желтый",  2015, "Россия", "Механическая",
                "Универсал", "н345ро055", 4,
                false, new Car.Key(false, false),
                new Car.Insurance(LocalDate.of(2023,03,05),
                        3800.0d, "t5uiu765j"), 185);
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro", 3.0,
                "черный",  2020, "Германия", "Автомат",
                "Кроссовер", "к667мм006", 4,
                true,new Car.Key(true, true),
                new Car.Insurance(LocalDate.of(2023,05,07),
                        7800.0d, "577878tyt"),250);
        Car bmwZ8 = new Car("BMW",
                "Z8", 3.0,
                "черный",  2021, "Германия", "Автомат",
                "Кабриолет", "у743вв094)", 2, false,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.of(2024, 07,11),
                        10500.87d, "er65789ty"), 259);
        Car kiaSportage = new Car("Kia",
                "Sportage", 2.4,
                "красный",  2018, "Южная Корея", "Автомат",
                "Кроссовер", "а443тт123", 4, true,
                new Car.Key(true, false),
                new Car.Insurance(LocalDate.of(2024, 10, 14),5600.0,
                        "rty8u7t4r"), 197);
        Car hyundaiAvante = new Car("Hyundai",
                "Avante", 1.6,
                "оранжевый",  2016, "Южная Корея", "Механическая",
                "Хеджбэк","с223ам011", 4, true,
                new Car.Key(false, false),
                new Car.Insurance(LocalDate.of(2023,12,25), 3555.0,
                        "4467uyjty"), 203);
        Train lastochka = new Train("Ласточка", "B-901",
                2011, "Россия", "", 301, 3500,"Белорусский вокзал",
                "Минск Пассажирский", 11);
        Train leningrad = new Train("Ленинград","D-125", 2019,  "Россия", "",
                270, 1700 ,"Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        Bus mersedes = new Bus("Mersedes", "A-31", 2015,
                "Германия", "Серый", 200);
        Bus isuzu = new Bus("Isuzu", "I-23", 2011,
                "Россия", "Белый", 205);
        Bus scania = new Bus("Scania", "FD34", 2000,
                "Швеция", "Желтый", 210);
        Herbivores gazelle = new Herbivores("Газель", 5, "степь", 50, "травы" );
        Herbivores giraffe = new Herbivores("Жираф", 3, "саванна", 20, "листья" );
        Herbivores horse = new Herbivores("Лошадь", 2, "степь", 88, "травы" );
        Predators hyena = new Predators("Гиена", 3, "пустыня",  45, "травоядные");
        Predators tiger = new Predators("Тигр", 8, "саванна", 55, "травоядные");
        Predators bear = new Predators("Медведь", 6, "лес", 40, "травоядные");
        Amphibians frog = new Amphibians("Лягушка", 2, "озеро" );
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "река");
        FlightlessBirds peacock = new FlightlessBirds("Павлин", 3, "джунгли", "ходит по земле");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 6, "Южный Полюс", "ходит по земле");
        FlightlessBirds dodoBird = new FlightlessBirds("Птица додо", 5, "Джунгли", "ходит по земле");
        FlyingBirds gull = new FlyingBirds("Чайка", 7, "море", "летает");
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 1, "море", "летает");
        FlyingBirds falcon = new FlyingBirds("Сокол", 4, "степи", "летает");


        System.out.println(ladaGranta);
        System.out.println(audi);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println(mersedes);
        System.out.println(isuzu);
        System.out.println(scania);


        ladaGranta.changeTires();
        audi.changeTires();
        bmwZ8.changeTires();
        kiaSportage.changeTires();
        hyundaiAvante.changeTires();
        ladaGranta.isRegNumberValid();
        audi.isRegNumberValid();
        bmwZ8.isRegNumberValid();
        kiaSportage.isRegNumberValid();
        hyundaiAvante.isRegNumberValid();
        ladaGranta.refill();
        scania.refill();
        lastochka.refill();

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}