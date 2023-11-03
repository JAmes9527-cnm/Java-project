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
public class Customer extends Person {
    private double Credit;
    
    public Customer(String CustomerID,String Name,String password,double Credit){
        super(CustomerID,Name,password);
        this.Credit=Credit;
    }
    
    @Override
    public String toString(){
        return super.toString() +","+Credit;
    }
}
