public class Latte extends Coffee {
    String milkType;
    String flavoredSyrup;
    Latte(String name, String roast, double price, String milkType,String flavoredSyrup) throws InvalidTypeException {
        super(name, roast, price);
        if (!milkType.equalsIgnoreCase("Oat")&&
                !milkType.equalsIgnoreCase("Almond")&&
                !milkType.equalsIgnoreCase("Coconut")&&
                !milkType.equalsIgnoreCase("Whole")){
            throw new InvalidTypeException("The selection of the Milk Type is not Available");
        }
        this.milkType = milkType;
        this.flavoredSyrup = flavoredSyrup;
    }
    void printLatteDetails(){
        System.out.println("Your latte has " + milkType + " milk and " + flavoredSyrup + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
