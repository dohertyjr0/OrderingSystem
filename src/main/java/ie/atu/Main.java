package ie.atu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        System.out.println("Welcome to JustApp");
        System.out.println("This is your order");
        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggieburger", 2.50, "Healthy");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Nice");
        Fries fries = new Fries("Curry Fries", 5.99, "Very tasty");

        //List all of the food items like burgers etc..
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(fries);
        //Display details to user
        for(MenuItem item : items){
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }
    }
}