/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author james
 */
public class CartChecker {
    public static double getTotal() {
        String filename = CustomerLogin.customerID + "Cart.txt";
        double total = 0.0; // Initialize total outside the try block

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    String foodID = data[0].trim(); // Trim any leading/trailing spaces
                    int quantity = Integer.parseInt(data[4].trim());
                    double foodPrice = Double.parseDouble(data[2].trim());
                    total += (foodPrice * quantity);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return total; // Return total outside the try block
    }
}
