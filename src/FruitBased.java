public class FruitBased extends Coffee {
    String fruitType;
    FruitBased(String name, String roast, double price, String fruitType) throws InvalidTypeException {
        super(name, roast, price);
        if (!fruitType.equalsIgnoreCase("DragonFruit") &&
                !fruitType.equalsIgnoreCase("Kiwi") &&
                !fruitType.equalsIgnoreCase("PassionFruit") &&
                !fruitType.equalsIgnoreCase("Mango")) {
            throw new InvalidTypeException("Please select a valid fruit type");
        }
        this.fruitType = fruitType;
    }
        void fruitBasedInfo(){
            System.out.println("You asked for " + fruitType + " drink");
            System.out.println("Every serving of Fruit Based Drink costs " + price + "$. Your total bill is " + (price) + "$.");
        }
        void mix(){
        System.out.println("Mixing up your drink.....");
        }
    }