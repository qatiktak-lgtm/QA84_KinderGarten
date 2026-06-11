package h_w_16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainGarage {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Porsche 911", 2022, "WP0AD2A9XNS123456", "PRSCH9",  LocalDate.of(2026, 3, 15)));
        carList.add(new Car("Tesla Model Y", 2023, "5YJ3E1EB8NF654321", "TSLA23", LocalDate.of(2026, 1, 10)));
        carList.add(new Car("Ford F-150", 2020, "1FTFW1EDXKD111222", "TEXAS1",  LocalDate.of(2026, 5, 20)));
        carList.add(new Car("BMW M4", 2021, "WBA3R1C0XLF333444", "FAST77",      LocalDate.of(2026, 2, 28)));
        carList.add(new Car("Audi A6", 2019, "WA1VAAF7XKA555666", "77777",     LocalDate.of(2026, 4, 05)));
        carList.add(new Car("MINI Cooper", 2022, "WMWXM7C0XMT777888", "MINI11",   LocalDate.of(2026, 1, 15)));
        carList.add(new Car("MINI Cooper", 2022, "WMWXM7C0XMT777000", "DD7410",   LocalDate.of(2026, 1, 15)));
        carList.add(new Car("MINI Cooper", 2022, "WMWXM7C0XMT777888", "MINI11",   LocalDate.of(2026, 1, 15)));
        carList.add(new Car("Toyota RAV4", 2024, "JTMDFRFV0PD999000", "REPAIR",  LocalDate.of(2026, 5, 02)));

        List<Owner> ownerList = new ArrayList<>();

        ownerList.add(new Owner("Alexander Wright", "+1-555-0141", 101, "789 Oak Dr, Houston"));
        ownerList.add(new Owner("Elena Rostova",    "+1-555-0142", 102, "122 Birch St, Seattle"));
        ownerList.add(new Owner("Marcus Aurelius",  "+1-555-0143", 103, "44 Rome Way, Austin"));
        ownerList.add(new Owner("Clara Oswald",     "+1-555-0144", 104, "221B Baker St, Boston"));
        ownerList.add(new Owner("David Miller",     "+1-555-0145", 105, "555 Pine Rd, Denver"));
        ownerList.add(new Owner("Yuki Tanaka",      "+1-555-0146", 106, "90 Cherry Ln, San Francisco"));
        ownerList.add(new Owner("Yuki Tanaka",      "+1-555-0146", 106, "90 Cherry Ln, San Francisco"));
        ownerList.add(new Owner("Yuki Tanaka",      "+1-555-0146", 106, "90 Cherry Ln, San Francisco"));
        ownerList.add(new Owner("John Doe",         "+1-555-0147", 107, "101 Unknown Blvd, Miami"));

        Garage stoGarage = new Garage("Workshop #1", "Boston, 25 Avenue", "+1-555-0150");
        stoGarage.addCar(carList, ownerList);
        stoGarage.printCarsInGarage();

        stoGarage.returnCarToOwner("MINI11");
        stoGarage.printCarsInGarage();


    }
}
