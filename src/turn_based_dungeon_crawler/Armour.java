/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turn_based_dungeon_crawler;

/**
 *
 * @author abule
 */
public class Armour {
    public String title;
    public int lvl;
    public int def;
    public String type;
    public int durability;
    public int price;
    
    public Armour(){}
    public Armour(String title, int lvl, int def, String type, int durability, int price){
        this.title = title;
        this.lvl = lvl;
        this.def = def;//percentage
        this.type = type;
        this.durability = durability;
        this.price = price;
    }
}
