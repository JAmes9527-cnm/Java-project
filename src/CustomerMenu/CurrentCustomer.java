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
import java.util.ArrayList;
import java.util.List;

public class CurrentCustomer {
    
    public static String getID() {
        String fileName = "currentCustomer.txt"; // Replace with the actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line); // Append the line to the content
            }

            String fileContent = content.toString();
            return fileContent; // Return the read content
        } catch (IOException ex) {
            ex.printStackTrace();
            return ""; // Return an empty string in case of an error
        }
    }
    
    public static String getCartPath(){
        String path = getID()+"Cart.txt";
        return path;
    }
    
    public static double getCredit(){
        double credit = CustomerChecker.findCustomerCredit(getID());
        return credit;
    }
    
    public static String getOrderHistoryPath(){
        String path = getID()+"OrderHistory.txt";
        return path;
    }
    
    public static List<String> getOrderHistory() {
    String path = getOrderHistoryPath();
    List<String> orderHistory = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        String line;

        while ((line = reader.readLine()) != null) {
            orderHistory.add(line);
        }
    } catch (IOException ex) {
        Logger.getLogger(customerMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    return orderHistory;
}

}
