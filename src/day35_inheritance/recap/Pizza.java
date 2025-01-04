package day35_inheritance.recap;

public class Pizza {

    private String size;
    private int numOfToppings;

    public Pizza(String size, int numOfToppings) {
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings > 0){
            this.numOfToppings = numOfToppings;
        }
    }

    public double calculatePrice(){
        double totalPrice = 0;

        if (size.equalsIgnoreCase("small")){
            totalPrice = 4;
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 6;
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 8;
        }

        totalPrice += numOfToppings * 0.75;

        return totalPrice;
    }


    public String toString() {
        return "Pizza Info: " +
                "\n\tSize: " + size +
                "\n\tNumber of Toppings: " + numOfToppings +
                "\n\tTotal Price: $" +  calculatePrice();
    }

}
