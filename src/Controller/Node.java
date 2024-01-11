/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.CartItem;
import Model.CartItem;
/**
 *
 * @author thaip
 */
public class Node extends CartItem{
    private CartItem data;
    public Node prev, next;
    static Node  head;

    public Node() {
    }
    
    

    public Node(CartItem data) {
        this.data = data;
        Node prev = null;
        Node next = null;
    }
    
    

     public void additem(CartItem b){
        Node newNode = new Node(b);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
    }
    public void removeItem(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.data.getItemName().equals(itemName)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
    public void adjustQuantity(String itemName, int newQuantity) {
        Node current = head;
        while (current != null) {
            if (current.data.getItemName().equals(itemName)) {
                current.data.setQuantity(newQuantity);
                return;
            }
            else {
                System.out.println("You item not found!");
            }
            current = current.next;
        }
    }

    public void printItem() {
        System.out.println("-----------------Your Item list----------------------");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
