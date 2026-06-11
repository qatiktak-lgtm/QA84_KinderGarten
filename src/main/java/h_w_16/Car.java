package h_w_16;

import java.time.LocalDate;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String winCode;
    private String regNumber;
    private LocalDate entryDate;
    private String serviceType;

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(winCode, car.winCode) && Objects.equals(regNumber, car.regNumber);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(winCode, regNumber);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", winCode='" + winCode + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", entryDate=" + entryDate +
               // ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public Car(String model, int year, String winCode, String regNumber, LocalDate entryDate) {
        this.model = model;
        this.year = year;
        this.winCode = winCode;
        this.regNumber = regNumber;
        this.entryDate = entryDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWinCode() {
        return winCode;
    }

    public void setWinCode(String winCode) {
        this.winCode = winCode;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    @Override
    public int compareTo(Car other) {
        int dateCompare = this.entryDate.compareTo(other.entryDate);
        if (dateCompare != 0){
            return dateCompare;
        }
        return this.winCode.compareTo(other.winCode);


    }

}

/*
  @Override
    public int compareTo(Car other) {
        int res = model.compareToIgnoreCase(other.model);
        if (res == 0)
            res = String.compare(regNumber, other.regNumber);
        return res;
    }

 int res = name.compareToIgnoreCase(other.name);
        if (res == 0)
            res = Integer.compare(id, other.id);
        return res;


public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return id == child.id;
    }
 */