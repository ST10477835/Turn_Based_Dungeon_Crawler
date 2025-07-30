/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turn_based_dungeon_crawler;

/**
 *
 * @author abule
 */
public class Potions {
    public String potion_name;
    public String effect;//buff, debuff
    public String type;//throwing or drinking
    public int lvl;
    public int price;
    
    public Potions(){}
    public Potions(String potion_name, String effect, String type, int lvl, int price){
        this.potion_name = potion_name;
        this.effect = effect;
        this.type = type;
        this.lvl = lvl;
        this.price = price;
    }
}
