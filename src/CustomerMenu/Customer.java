/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author james
 */
public class Customer {
    
    private List<String> lines;
    private String CustomerID;

    public Customer(String filePath) throws IOException {
        this.lines = Files.readAllLines(Paths.get(filePath));
    }

    private int findLineIndex(String foodId) {
        int lineIndex = -1;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] menuData = line.split(",");
            String currentFoodId = menuData[0];
            if (currentFoodId.equals(foodId)) {
                lineIndex = i;
                break;
            }
        }
        return lineIndex;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }
    
}
