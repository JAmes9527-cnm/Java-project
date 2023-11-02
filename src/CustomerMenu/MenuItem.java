/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

/**
 *
 * @author james
 */
class MenuItem extends item {
    private String vendorName;

    public MenuItem(String Id, String Name, String Price, String vendorName) {
        super(Id, Name, Price);
        this.vendorName = vendorName;
    }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }
    }
