package day35_inheritance.computer;

public class Classroom {
    public static void main(String[] args) {

        Windows win1 = new Windows("Windows 10", 1024);
        // win1.os = "Windows 10";
        // win1.memory = 1024;
        Windows win2 = new Windows("Windows 11", 512, "Edge");



        Mac mac1 = new Mac("MacOS 10", 1024);
        Mac mac2 = new Mac("MacOS 11", 512, "Safari");



        Computer computer1 = new Computer("General", 1024);





    }
}