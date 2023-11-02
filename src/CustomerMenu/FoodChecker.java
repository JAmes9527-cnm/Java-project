/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author james
 */
public class FoodChecker {
    public static double findFoodPrice(String foodID) {
        try (BufferedReader reader = new BufferedReader(new FileReader("MENU.txt"))) {
            String line;
    
            while ((line = reader.readLine()) != null) {
                String[] menuData = line.split(",");
                if (menuData.length == 4) {
                    String menuFoodID = menuData[0].trim(); // Trim any leading/trailing spaces
                    if (menuFoodID.equals(foodID)) {
                        // The FoodID exists, return the price
                        double price = Double.parseDouble(menuData[2].trim()); // Assuming the price is in the third position
                        return price;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
        // FoodID doesn't exist, return a default value or handle it accordingly
        return -1.0; // You can choose any default value, e.g., -1.0 to indicate not found
    }
    
    public static String findFoodName(String foodID) {
         try (BufferedReader reader = new BufferedReader(new FileReader("MENU.txt"))) {
            String line;
    
            while ((line = reader.readLine()) != null) {
                String[] menuData = line.split(",");
                if (menuData.length == 4) {
                    String menuFoodID = menuData[0].trim(); // Trim any leading/trailing spaces
                    if (menuFoodID.equals(foodID)) {
                        // The FoodID exists, return the price
                        String Name = menuData[1].trim(); // Assuming the price is in the third position
                        return Name;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
         return "0";
    }
    
    public static String findFoodVendor(String foodID) {
         try (BufferedReader reader = new BufferedReader(new FileReader("MENU.txt"))) {
            String line;
    
            while ((line = reader.readLine()) != null) {
                String[] menuData = line.split(",");
                if (menuData.length == 4) {
                    String menuFoodID = menuData[0].trim(); // Trim any leading/trailing spaces
                    if (menuFoodID.equals(foodID)) {
                        // The FoodID exists, return the price
                        String Name = menuData[3].trim(); // Assuming the price is in the third position
                        return Name;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
         return "0";
    }
}