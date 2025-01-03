package day34_b_encapsulation;

public class Square {

    private int side;

    public Square (int side) {
        //this.side = side;
        setSide(side);
    }

    public void setSide(int side) {
        if(side > 0){
            this.side = side;
        }
    }

    public int getSide () {
        return side;
    }

    public int calculateArea () {
        int result = side * side;
        return result;
    }

    public int calculatePerimeter () {
        // return side + side + side + side;
        return 4 * side;
    }

    public String toString() {
        String message = "";
        message = "Info about the Square: " +
                "\n\tSide: " + side +
                "\n\tArea: " + calculateArea() +
                "\n\tPerimeter: " + calculatePerimeter();
        return message;
    }


}
