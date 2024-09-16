
/** Method: bikeTester;
 * Create an object of class Person called person1
 * @param name name of person to be converted
 * @param age sge of person to be converted
 * @param eyeColor eyeColor of person to be converted
 * @return bike details from Person and Person 1
 */

public class PersonTester {
    public static void main (String[]args){
     //Person1 object
        Person person1 = new Person();
     //SOP person1 details using toString()
        System.out.print(person1);
    //setter method to set/change the name of person1 to “Howard Roark”.
        person1.setName("Howard Roark");
   //Invoke the talk() method on person1
        person1.talk();
    }
}
