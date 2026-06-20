import java.util.Scanner;

public class Burger extends FoodItem {
    public Burger(){
        super(2, "Cheese Burger", 250.00);
    }

    @Override

    public void customize(Scanner sc){
        System.out.println("Customizing:" + baseName + ":");

        System.out.println(" Add extra patty? (+₹100) (Yes/ No): ");
        if(sc.nextLine().trim().equalsIgnoreCase("yes")){
            this.customizations.add("Extra Patty");
            this.additionalPrice += 100;
        }

        System.out.println(" Add extra bacon? (+₹50) (Yes/ No): ");
        if(sc.nextLine().trim().equalsIgnoreCase("yes")){
            this.customizations.add("Extra Bacon");
            this.additionalPrice += 50;
        }
    }

    @Override
    public FoodItem create(){
        return new Burger();
    }
}