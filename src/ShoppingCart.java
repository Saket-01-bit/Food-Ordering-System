import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<FoodItem, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(FoodItem item, int quantity) {
        int currentQuantity = items.getOrDefault(item, 0);
        this.items.put(item, currentQuantity + quantity);

        System.out.println(quantity + " x " + item.getName() + "(s) added to the cart.");
    }

    public double calculateTotal(){
        double total = 0.0;

        for(Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            FoodItem item = entry.getKey();
            Integer quantity = entry.getValue();
            total += item.getPrice() * quantity;
        }
        return total;
    }

    public void displayCart(){
        if(items.isEmpty()){
            System.out.println("No items in your cart.");
            return;
        }

        System.out.println("---YOUR CART---");
        for(Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            FoodItem item = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println(item.getName() + " (x" + quantity + ") - ₹" + String.format("%.2f", item.getPrice() * quantity));
        }

        System.out.println("--------------");
        System.out.println("Total: ₹" + String.format("%.2f", calculateTotal()));
    }

    public void clearCart(){
        items.clear();
    }
    public boolean  isEmpty(){
        return items.isEmpty();
    }

    public Map<FoodItem, Integer> getItems(){
        return new  HashMap<>(items);
    }
}