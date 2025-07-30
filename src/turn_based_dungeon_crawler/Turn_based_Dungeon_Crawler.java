/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turn_based_dungeon_crawler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abule
 */
public class Turn_based_Dungeon_Crawler {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Weapon> weapon_store = new ArrayList<>();
    public static ArrayList<Potions> potion_store = new ArrayList<>();
    public static ArrayList<Food> food_store = new ArrayList<>();
    public static ArrayList<Armour> armour_store = new ArrayList<>();

    public static ArrayList<Weapon> weapon_inventory = new ArrayList<>();
    public static ArrayList<Potions> potion_inventory = new ArrayList<>();
    public static ArrayList<Food> food_inventory = new ArrayList<>();
    public static ArrayList<Armour> armour_inventory = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        SetUpWeapon(weapon_store);
        SetUpPotions(potion_store);
        SetUpFood(food_store);
        SetUpArmour(armour_store);

        Scanner scanner = new Scanner(System.in);
        boolean TF = true;
        while (TF) {
            System.out.println("""
                               *********************************
                               Welcome to the world of Arcadia
                               *********************************
                               Press (1) to open the start menu""");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    boolean TF2 = true;
                    while (TF2) {
                        System.out.println("""
                                           START MENU
                                           *********************************
                                           1)New Game
                                           2)Load Game
                                           3)Exit
                                           *********************************""");
                        int menu_select = scanner.nextInt();

                        switch (menu_select) {
                            case 1 -> {
                                System.out.println("""
                                                   =================================
                                                   PLEASE SELECT A CHARACTER CLASS:
                                                   1) MAGE
                                                   2) KNIGHT
                                                   3) THIEF
                                                   4) <- BACK
                                                   =================================""");
                                int class_choice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Please enter your username: ");
                                String name = scanner.nextLine();

                                Character char1 = new Character(class_choice, name);

                                System.out.println("Welcome, " + char1.char_class + " " + name + " To the world of Arcadia");

                                boolean TF3 = true;
                                while (TF3) {
                                    System.out.println("""
                                                    What would you like to do:
                                                    =================================
                                                    1) Go to Market Place
                                                    2) Go Dungeon Crawling
                                                    3) Open menu
                                                    4) Exit Game
                                                    5) <- Back to Starting screen
                                                    =================================""");
                                    int play_choice = scanner.nextInt();

                                    switch (play_choice) {
                                        case 1 -> {

                                            boolean TF4 = true;

                                            while (TF4) {
                                                System.out.println("""
                                                               You have walked into the market place. What would you like to purchase:
                                                               =======================================================================
                                                               1) Weapons
                                                               2) Potions
                                                               3) Food
                                                               4) Armour
                                                               5) Leave Market Place
                                                               =======================================================================""");
                                                int purchase_choice = scanner.nextInt();
                                                switch (purchase_choice) {
                                                    case 1 -> {// Purchasing weapons
                                                        System.out.println("""
                                                                           You are currently in the Weapon Store,
                                                                           What would you like to purchase:
                                                                           =======================================""");
                                                        boolean TF5 = true;
                                                        while (TF5) {
                                                            int weapon_counter = 0;
                                                            for (Weapon weapon : weapon_store) {
                                                                weapon_counter++;
                                                                System.out.println(weapon_counter + ") " + weapon.weapon_name + "\n-----Rank: " + weapon.rank + "\n-----Attack: " + weapon.atk + "\n-----Durability: " + weapon.durability + "\n-----Effect: " + weapon.effect + "\n-----Price: " + weapon.price);
                                                            }
                                                            weapon_counter++;
                                                            System.out.println(weapon_counter + ") <-- Back\n=======================================");

                                                            int weapon_choice = scanner.nextInt();

                                                            if (weapon_choice == weapon_counter) {
                                                                TF5 = false;
                                                            } else {
                                                                System.out.println("*Are you Sure you would like to purchase the " + weapon_store.get(weapon_choice - 1).weapon_name);
                                                                
                                                                scanner.nextLine();
                                                                String confirmation = scanner.nextLine();
                                                                switch (confirmation) {
                                                                    case "y" -> {
                                                                        System.out.println("=======================================\nYou have just purchased the " + weapon_store.get(weapon_choice - 1).weapon_name + "\n=======================================");
                                                                    }
                                                                    default -> {

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {// Purchasing potions
                                                        System.out.println("""
                                                                           You are currently in the Potions Store,
                                                                           What would you like to purchase:
                                                                           =======================================""");
                                                        int potion_counter = 0;
                                                        for (Potions potion : potion_store) {
                                                            potion_counter++;
                                                            System.out.println(potion_counter + ") " + potion.potion_name + "\n-----Level: " + potion.lvl + "\n-----Type: " + potion.type + "\n-----Effect: " + potion.effect + "\n-----Price: " + potion.price);
                                                        }
                                                        potion_counter++;
                                                        System.out.println(potion_counter + ") <-- Back\n=======================================");

                                                        int potion_choice = scanner.nextInt();

                                                        if (potion_choice == potion_counter) {

                                                        }
                                                    }
                                                    case 3 -> {// Purchasing food
                                                        System.out.println("""
                                                                           You are currently in the Food Store,
                                                                           What would you like to purchase:
                                                                           =======================================""");
                                                        int food_counter = 0;
                                                        for (Food food : food_store) {
                                                            food_counter++;
                                                            System.out.println(food_counter + ") " + food.name + "\n-----Type: " + food.type + "\n-----Regen: " + food.regen + "\n-----Price: " + food.price + "\n-----Quantity: " + food.quantity);
                                                        }
                                                        food_counter++;
                                                        System.out.println(food_counter + ") <-- Back\n=======================================");

                                                        int food_choice = scanner.nextInt();
                                                        if (food_choice == food_counter) {

                                                        }
                                                    }
                                                    case 4 -> {// Purchasing armour
                                                        System.out.println("""
                                                                           You are currently in the Armour Store,
                                                                           What would you like to purchase:
                                                                           =======================================""");
                                                        int armour_counter = 0;
                                                        for (Armour armour : armour_store) {
                                                            if (armour.type.equals(char1.char_class)) {
                                                                armour_counter++;
                                                                System.out.println(armour_counter + ") " + armour.title + "\n-----Level: " + armour.lvl + "\n-----Defense: " + armour.def + "\n-----Durability: " + armour.durability + "\n-----Price: " + armour.price);
                                                            }
                                                        }
                                                        armour_counter++;
                                                        System.out.println(armour_counter + ") <-- Back\n=======================================");
                                                        int armour_choice = scanner.nextInt();

                                                        if (armour_choice == armour_counter) {

                                                        }
                                                    }
                                                    case 5 -> {
                                                        TF4 = false;
                                                    }
                                                    default -> {

                                                    }
                                                }
                                            }
                                        }
                                        case 2 -> {

                                        }
                                        case 3 -> {

                                        }
                                        case 4 -> {
                                            System.exit(0);
                                        }
                                        case 5 -> {
                                            TF3 = false;
                                        }
                                        default -> {

                                        }
                                    }
                                }

                            }
                            case 2 -> {
                                /**
                                 * Coming Soon
                                 */
                            }
                            case 3 -> {
                                System.out.println("Closing Game....");
                                System.exit(0);
                            }
                            default -> {
                                System.exit(0);
                            }
                        }
                    }
                }
                default -> {
                    TF = false;
                }
            }
        }
    }

    public static void SetUpWeapon(ArrayList<Weapon> list) {
        list.add(new Weapon("Staff", "Wizard", "SR", 50, 100, "null", 20));
        list.add(new Weapon("Wand", "Wizard", "SSR", 70, 100, "null", 40));
        list.add(new Weapon("Sword", "Knight", "SR", 50, 100, "null", 20));
        list.add(new Weapon("Spear", "Knight", "SSR", 70, 100, "null", 40));
        list.add(new Weapon("Dagger", "Thief", "SR", 50, 100, "null", 20));
        list.add(new Weapon("Claws", "Thief", "SSR", 70, 100, "null", 40));
    }

    public static void SetUpPotions(ArrayList<Potions> list) {
        list.add(new Potions("Strength", "Buff atk", "drinking", 1, 15));
        list.add(new Potions("Haste", "Buff agi", "drinking", 1, 15));
        list.add(new Potions("Poison", "Debuff hp", "throwing", 1, 15));
        list.add(new Potions("Lethargy", "Debuff agi", "throwing", 1, 15));
        list.add(new Potions("Health", "Buff hp", "drinking", 2, 20));
    }

    public static void SetUpFood(ArrayList<Food> list) {
        list.add(new Food("Steak", "normal", 30, 20, 4));
        list.add(new Food("Apple", "atk buff", 20, 40, 4));
        list.add(new Food("Bread", "normal", 10, 10, 4));
        list.add(new Food("Chicken", "defense buff", 20, 40, 4));

    }

    public static void SetUpArmour(ArrayList<Armour> list) {
        list.add(new Armour("Wizard's Garbs", 2, 10, "Wizard", 100, 40));
        list.add(new Armour("Knightly Trim", 2, 10, "Knight", 100, 40));
        list.add(new Armour("Thief's Rags", 2, 10, "Thief", 100, 40));
    }

}
