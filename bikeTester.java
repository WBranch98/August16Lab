/** Method: bikeTester;
 * Create an object of class Person called person1
 * @param wheels number of wheels on bike to be converted
 * @param manufacturer manufacturer of the bike to be converted
 * @param year year bike was manufactured to be converted
 * @return bike details from bike1 and bike2
 */

import java.util.ArrayList;

public class bikeTester {
    public static void main (String[]args){
        bike bike1 = new bike();

        System.out.print(bike1);

        bike bike2 = new bike();
        bike2.setWheels(4);  // Set new values for bike2
        bike2.setManufacturer("Honda");
        bike2.setYear(2020);
        System.out.println(bike2);


        ArrayList<bike> bikeList = new ArrayList<>();

        // Add bike1 and bike2 to bikeList
        bikeList.add(bike1);
        bikeList.add(bike2);

        // Print the list of bikes
        System.out.println("Bike List: " + bikeList);

        // Count the total number of wheels in bikeList
        int totalWheels = 0;
        for (bike bike : bikeList) {
            totalWheels += bike.getWheels();
        }
        System.out.println("Total number of wheels on all bikes: " + totalWheels);

        // Find the year of the oldest bike
        int oldestYear = bikeList.get(0).getYear();
        for (bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }
        System.out.println("Year of the oldest bike: " + oldestYear);
    }
}

