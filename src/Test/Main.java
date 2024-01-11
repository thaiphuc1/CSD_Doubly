/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import Model.CartItem;
import View.Menu;
import Controller.Node;

/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc = {"Print all items","Add item","Remove item","Adjust item", "Exit"};
    Node node = new Node();
    public Main(){
        super("Shopping Cart", mc);
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
    
    @Override
    public void execute(int ch) {
    switch(ch){
            case 1: print();break;
            case 2: addItem();break;
            case 3: removeItem();break;
            case 4: adjust();break;
            case 5: System.exit(0);
        }
    }
    
    
    
    
    
    
    public void adjust(){
        String name = Menu.getString("Enter name item you want adjust quantity : ");
        int quantity = Integer.parseInt(Menu.getString("Enter new quantity : "));
        node.adjustQuantity(name, quantity);
        node.printItem();
    }
    
    public void addItem(){
        String nameItem = Menu.getString("Enter your name item : ");
        
        int quantity = Integer.parseInt(Menu.getString("Enter quantity item : "));
        node.additem(new CartItem(nameItem, quantity));
        
         
        
         
    }
    
    public void print(){
        node.printItem();
    }
    
    public void removeItem(){
        String name = Menu.getString("Enter your name item you want remove : ");
        node.removeItem(name);
        
    }
    
}
