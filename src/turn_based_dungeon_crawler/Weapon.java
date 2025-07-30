/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turn_based_dungeon_crawler;

/**
 *
 * @author abule
 */
public class Weapon {
    public String weapon_name;
    public String char_class;
    public String rank;//SR, SRR, UR
    public int atk;
    public int durability;
    public String effect;
    public int price;
    
    public Weapon(){}
    
    public Weapon(String weapon_name, String char_class,String rank, int atk, int durability, String effect, int price){
        this.weapon_name = weapon_name;
        this.char_class = char_class;
        this.rank = rank;
        this.atk = atk;
        this.durability = durability;
        this.effect = effect;
        this.price = price;
    }
}
