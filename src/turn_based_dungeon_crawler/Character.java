/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turn_based_dungeon_crawler;

/**
 *
 * @author abule
 */
public class Character{
    public String name;
    public String char_class;
    public int coins;
    public int lvl;
    public int hp;
    public int atk;
    public int intell;
    public int wis;
    public int agi;
    
    public Character(){}
    public Character(int char_class, String name){
        this.name = name;
        this.lvl = 1;
        this.coins = 100;
        switch(char_class){
            case 1 -> {
                this.char_class = "Wizard";
                this.hp = 10;
                this.atk = 10;
                this.intell = 20;
                this.wis = 15;
                this.agi = 5;
            }
            case 2 -> {
                this.char_class = "Knight";
                this.hp = 20;
                this.atk = 15;
                this.intell = 10;
                this.wis = 10;
                this.agi = 10;
            }
            case 3 -> {
                this.char_class = "Thief";
                this.hp = 10;
                this.atk = 15;
                this.intell = 10;
                this.wis = 5;
                this.agi = 20;
            }
        }
    }
}
