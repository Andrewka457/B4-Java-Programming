package day35_inheritance.book;

public class EBook extends Book{

//    String author;
//    int authorAge;
//    String genre;
//    String title;
//    int chapterCount;
//    double price;
//    boolean hasMovie;

    double size;
    int pages;


    public void read () {
        System.out.println("Reading " + title + " which is " + pages + " pages.");
    }
}