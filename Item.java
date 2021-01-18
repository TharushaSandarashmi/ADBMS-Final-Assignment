/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Item {
   int Item_ID;
   String Item_Name;
   float Item_Price;
int Item_Qty,Supplier_ID;
    

    public Item(int Item_ID, String Item_Name, float Item_Price, int Item_Qty, int Supplier_ID) {
        this.Item_ID = Item_ID;
        this.Item_Name = Item_Name;
        this.Item_Price = Item_Price;
        this.Item_Qty = Item_Qty;
        this.Supplier_ID = Supplier_ID;
    }

 

    public int getItem_ID() {
        return Item_ID;
    }

    public int getItem_Qty() {
        return Item_Qty;
    }

    public int getSupplier_ID() {
        return Supplier_ID;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public float getItem_Price() {
        return Item_Price;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public void setItem_Qty(int Item_Qty) {
        this.Item_Qty = Item_Qty;
    }

    public void setSupplier_ID(int Supplier_ID) {
        this.Supplier_ID = Supplier_ID;
    }

    public void setItem_Name(String Item_Name) {
        this.Item_Name = Item_Name;
    }

    public void setItem_Price(float Item_Price) {
        this.Item_Price = Item_Price;
    }
   
   
}
