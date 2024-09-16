/**Class: textbook
 * @author Whitney Branch
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: Sept 13 2024
 *
 * This class – Attributes of the textbook
 */


//Instance Variables

public class textbook {
    private String title;
    private int year;
    private String author;

    // No-argument constructor
    public textbook() {
        this.title = "Twilight";
        this.year = 2017;
        this.author = "K. Wentworth";
    }

    public textbook(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
//getters

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//toString() method to display textbook details
    public String toString() {
        return "Title:" + title + ", Year:" + year + ", Author:" + author + " ";

    }
}