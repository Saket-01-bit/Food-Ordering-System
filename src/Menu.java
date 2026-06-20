import java.util.ArrayList;
import java.util.List;

public class Menu{
    private List<FoodItem> items;

    public Menu(){
        this.items = new ArrayList<>();
        intializeMenu();
    }

    private void intializeMenu(){
        items.add(new Pizza());
        items.add(new Burger());
        items.add(new Salad());
        items.add(new Soda());
    }


    public void displayMenu(){
        System.out.println("---Menu(Base Price)---");
        for (FoodItem item : items){
            System.out.println(item);
        }

        System.out.println("-----------------------");
    }

    public FoodItem getPrototypeItemById(int id){
        for (FoodItem item : items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }
}