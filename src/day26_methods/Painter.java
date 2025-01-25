package day26_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw("blue");

        Picture.draw("red", "yellow");
        Picture.draw("black", "white", "pink");


        Picture.draw(3, "Purple");
        Picture.draw( "Green", 5);

        Picture.draw(7);
    }
}
