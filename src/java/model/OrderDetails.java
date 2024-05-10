
package model;

/**
 *
 * @author dillo
 */
public class OrderDetails {
    
    private String productName;
    private double productPrice;
    private String date;
    private double subtotal;
    private int OrderID;
    private int Quantity;
    private String Image;
    private String Address;
    private String Phoneno;

    public OrderDetails(String productName, double productPrice, String date, double subtotal, int OrderID, int Quantity ,String Image ,String Address ,String Phoneno) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.date = date;
        this.subtotal = subtotal;
        this.OrderID = OrderID;
        this.Quantity=Quantity;
        this.Image= Image;
        this.Address = Address;
        this.Phoneno =Phoneno;
    }
    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getDate() {
        return date;
    }

    public double getSubtotal() {
        return subtotal;
    }
    
    public int getOrderID(){
        return OrderID;
    }
    
    public int getQuantity(){
        return Quantity;
    }
    
    public String getImage(){
        return Image;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public String getPhoneno (){
        return Phoneno;
    }
}

