import java.util.Scanner;
public class Starbucks {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //while true keep running the menu.
        while (true){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("************ WELCOME TO STARBUCKS *****************");
            System.out.println("Please Select an option below:");
            System.out.println("1.Espresso");
            System.out.println("2.latte");
            System.out.println("3.Fruit Based");
            System.out.println("4.Exit");
            System.out.println("Please Select 1-3");

            //Reading Users Choice in Int
            int choice;
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }
            switch (choice){
                case 1:
                    //Initializing the name and price of espresso:
                   String espressoName = "Espresso";
                   double espressoPrice = 5.59;
                    System.out.println("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = keyboard.nextLine();

                    // Ask the user for the number of shots and store it in noOfShots
                    System.out.println("How many servings would you like? (a number please): ");

                    int noOfShots;
                    try {
                        noOfShots = Integer.parseInt(keyboard.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number entered. Defaulting to 1 shot.");
                        noOfShots = 1;
                    }

                    Espresso espresso = null;
                    while (true) {
                        try {
                            espresso = new Espresso(espressoName, espressoRoast, espressoPrice , noOfShots);
                            espresso.brewCoffee();
                            espresso.grindBeans();
                            espresso.printInfo();
                            espresso.printEspressoDetails();
                            break;
                        } catch (ArithmeticException e) {
                            System.out.println("Please enter a valid no!!!");

                            try {
                                noOfShots = Integer.parseInt(keyboard.nextLine());
                            } catch (NumberFormatException ex) {
                                noOfShots = 1;
                            }

                        }finally {
                            if (espresso == null){
                                try {
                                    espresso = new Espresso(espressoName, espressoRoast, espressoPrice , noOfShots);
                                }catch (ArithmeticException ignored){

                                }
                            }
                            System.out.println("Preparing your Espresso.....");
                        }
                    }
                break;
                case 2:
                    String latteName = "Latte";
                    double lattePrice = 5.59;
                    //ASK FOR USER CHOICES AND STORE IT ACCORDING TO THE PREFERRED DATA TYPE
                    System.out.println("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = keyboard.next();
                    System.out.println("What type of Milk would you like? (oat, almond, coconut, whole): ");
                    String milkType = keyboard.next();
                    System.out.println("Would you like to add a flavored syrup ? (e.g., vanilla, caramel): ");
                    String flavoredSyrup = keyboard.next();

                    Latte latte =  null;
                    while (true){
                        try {
                            latte = new Latte(latteName,latteRoast,lattePrice,milkType,flavoredSyrup);
                            latte.grindBeans();
                            latte.brewCoffee();
                            latte.printInfo();
                            latte.printLatteDetails();
                            System.out.println("Preparing your Latte......");
                         break;
                        }catch (InvalidTypeException e){
                            keyboard.nextLine();
                            System.out.println("Please enter a valid MilkType ");
                            milkType = keyboard.nextLine();
                        }finally {
                            if(latte == null){
                                try {
                                    latte = new Latte(latteName,latteRoast,lattePrice,milkType,flavoredSyrup);
                                }catch (InvalidTypeException ignored ){

                                }
                            }
                        }
                    }
                    break;
                case 3:
                    String fruitBasedName = "Fruit Based";
                    double fruitBasedPrice = 6.99;
                    System.out.println("Select your preferred fruit(DragonFruit, Kiwi, PassionFruit, Mango");
                    String fruitType = keyboard.nextLine();
                    System.out.println("What roast?? light, medium or dark?");
                    String fruitRoast = keyboard.nextLine();

                    FruitBased fruitBased = null;
                    while (true) {
                        try {
                            fruitBased = new FruitBased(fruitBasedName, fruitRoast, fruitBasedPrice, fruitType);
                            fruitBased.setCaffeineLevel();
                            fruitBased.mix();
                            fruitBased.printInfo();
                            fruitBased.fruitBasedInfo();
                            System.out.println("Your drink is preparing....");
                            break;
                        } catch (InvalidTypeException e) {
                            System.out.println("Please enter a valid Fruit Type");
                             fruitType = keyboard.nextLine();
                            }
                        }

                  break;
                case 4:
                    System.out.println("Thank you for using the Starbucks Menu Order!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
