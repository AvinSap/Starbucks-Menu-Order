public class Coffee {
    //COMMON ATTRIBUTES FOR COFFEE OBJECT
    String name;
    String roast;
    int caffeineLevel;
    double price;

    Coffee(String name, String roast, double price){
        this.name = name;
        this.roast = roast;
        this.price = price;

        //APPLYING TRY_CATCH FOR HANDLING
        try {
            setCaffeineLevel();
        }catch (InvalidTypeException e){
            caffeineLevel = 50;
        }
    }

    void setCaffeineLevel() throws InvalidTypeException {
        if (roast.equals("light")){
            caffeineLevel = 50;
        }else if (roast.equals("medium")){
            caffeineLevel = 100;
        } else if (roast.equals("dark")) {
            caffeineLevel = 150;
        }else {
            throw new InvalidTypeException("Invalid roast: " + roast + " Please select a valid roast type.");
        }
    }

    //ACTIONS OR METHODS:
    void grindBeans(){
        System.out.println("\nGrinding Beans for " + name + "...");

    }
    void brewCoffee(){
        System.out.println("\nBrewing your favorite " + name + "...");
    }
    //COFFEE INFORMATION:
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your Starbucks coffee is " + caffeineLevel + " mg.");
    }
}
