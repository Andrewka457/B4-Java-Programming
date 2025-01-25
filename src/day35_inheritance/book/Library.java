package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();

        ab1.duration = 100; // mins
        ab1.narrator = "Morgan Freeman";
        ab1.title = "Java is Awesome";

        ab1.listen();
        //ab1.read();


        EBook eb1 = new EBook();

        eb1.size = 10;
        eb1.pages = 600;
        eb1.title = "Selenium";

        eb1.read();
        //eb1.listen();


        Book b1 = new Book();
        //b1.authorName = "Ab Jerry";
        //b1.narrator;
        //b1.pages;


        Author a1 = new Author("FEYRUZ JErry", -23);
        System.out.println(a1);


        Book b2 = new Book();
        System.out.println(b2.author);
        //Author a2 = new Author("Nadir Softskills", 30);
        b2.author = new Author("Nadir Softskills", 30);
        System.out.println(b2.author);


        AudioBook ab3 = new AudioBook();
        ab3.author = new Author("Tom Freeman", 40);
        System.out.println(ab3.author);

        EBook eb2 = new EBook();
        eb2.author = new Author("John Freeman", 50);
        System.out.println(eb2.author);


    }
}
