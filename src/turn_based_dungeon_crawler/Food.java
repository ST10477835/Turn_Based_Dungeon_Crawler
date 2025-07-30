/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turn_based_dungeon_crawler;

/**
 *
 * @author abule
 */
public class Food {
    public String name;
    public String type;//normal, atk buff, defense buff
    public int regen;// how much hp you recover from eating
    public int price;//only coins
    public int quantity;
    
    public Food(){}
    public Food(String name, String type, int regen, int price, int quantity){
        this.name = name;
        this.type = type;
        this.regen = regen;
        this.price = price;
        this.quantity = quantity;
    }
}
