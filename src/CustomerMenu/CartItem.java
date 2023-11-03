/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

/**
 *
 * @author james
 */
public class CartItem extends MenuItem{
    private int Quantity;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public CartItem(String itemID,String Name, String Price,String vendorName,int Quantity){
        super(itemID,Name,Price,vendorName);
        this.Quantity=Quantity;
    }
    
    @Override
    public String toString(){
        return super.toString()+","+Quantity;
    }
}
