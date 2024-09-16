/**Class: textbook
 * @author Whitney Branch
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: Sept 13 2024
 *
 * This class – Attributes of bike
 */


//Attributes of Person
public class bike {
    private int wheels;
    private String manufacturer;
    private int year;

//3 argument constructor
    public bike() {
        this.wheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }
    //no-argument constructor
    public bike(int wheels, String manufacturer, int year) {
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }


    //getters

    public int getWheels() {
        return wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

//setters

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //toString override
    public String toString() {
        return "Number of Wheels:" + wheels + ", Manufacturer:" + manufacturer + ", Year:" + year + " ";
    }
    }
