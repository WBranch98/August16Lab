/**Class: Person
 * @author Whitney Branch
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: Sept 13 2024
 *
 * This class – Attributes of Person
 */


//Attributes of Person
public class Person {
    private String name;
    private int age;
    private String eyeColor;
//3 argument constructor
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
//no-argument constructor
    public Person() {
        this.name = "Michael Jackson";
        this.age = 54;
        this.eyeColor = "blue";
    }
    //Getters
    public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEyeColor() {
            return eyeColor;
        }
    //Setters
    public void setName(String name){
                this.name=name;
            }
            public void setAge(int age){
          this.age=age;
      }
    public void setEyeColor(String name){
        this.eyeColor=eyeColor;
    }
    //toString override
    public String toString() {
        return  "Name:"+name+", Age:"+age+ ", Eye Color:"+eyeColor+" ";
    }
    //talk method
    public void talk() {
        System.out.println("Welcome, coders! I am " + name + ".");
     }  
    }
