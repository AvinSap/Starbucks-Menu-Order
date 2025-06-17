public class Espresso extends Coffee {
    int noOfShots;
    Espresso(String name, String roast, double price, int noOfShots) {
        super(name, roast, price);
        this.noOfShots = noOfShots;
        if (this.noOfShots <= 0) {
            throw new ArithmeticException("Please select at-least 1 coffee serving.");
        }
    }
    void printEspressoDetails() {
        System.out.println("You asked for " + noOfShots + " serving");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * noOfShots) + "$.");
    }
}

