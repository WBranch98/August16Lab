/** Method: textbookTester;
 * Create an object of class Person called person1
 * @param title title of the textbook to be converted
 * @param year year of the publication date to be converted
 * @param Author author of the textbook to be converted
 * @return book details from textbook1 and textbook2
 */

public class textbookTester {
    public static void main(String[] args) {
        //textbook1 object using no-arg constructor
        textbook textbook1 = new textbook();
        System.out.print(textbook1);

        //textbook2 object using no-arg constructor
        textbook textbook2 = new textbook("Java Programming", 2010, "John Smith");
        System.out.print(textbook2);

// Use setters to modify the details of textbook1
        textbook1.setTitle("Introduction to Algorithms");
        textbook1.setAuthor("Thomas H. Cormen");
        textbook1.setYear(2021);


        System.out.println(textbook1);

        //getter to access private member variables
        System.out.println("Title: " + textbook2.getTitle());
        System.out.println("Author: " + textbook2.getAuthor());
        System.out.println("Publication Year: " + textbook2.getYear());
        System.out.println("Author of textbook2: " + textbook2.getAuthor());
    }
}

