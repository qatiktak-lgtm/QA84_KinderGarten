package h_w_16;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Garage {
    private String name;
    private String address;
    private String phone;

    private TreeMap<Car, Owner> carsInGarage = new TreeMap<>();

    public void addCar(List<Car> c, List<Owner> ow) {
        for (int i = 0; i < c.size(); i++) {
            Car car = c.get(i);
            Owner owner = ow.get(i);
            carsInGarage.put(car, owner);
        }
    }

    public void returnCarToOwner(String regNumber){
        Set<Car> keys = carsInGarage.keySet();
        for (Car key: keys){
            if (key.getRegNumber() == regNumber){
                carsInGarage.remove(key);
                System.out.println("#".repeat(30));
                System.out.println(key.getModel() + ", RegNumber: " + key.getRegNumber());
                System.out.println("Removed !!!");
                return;
            }
        }
        System.out.println("Error: wrong regNumber");


    }


    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", carsInGarage =" + carsInGarage.size() +
                '}';
    }

    public Garage(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printCarsInGarage() {
        System.out.println("~".repeat(40));
        System.out.println("Garage: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("~".repeat(40));
        System.out.println("\t\tCars (sort by date of receipt): ");
        Set<Car> keys = carsInGarage.keySet();
        for (Car key : keys) {
            System.out.println(key);
            Owner value = carsInGarage.get(key);
            System.out.println("\t" + value);
        }
        System.out.println("~".repeat(130));
    }


}
