package model;

public class orders {

    private String quantity;
    public void setOrderQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getOrderQuantity() {
        return quantity;
    }

    private String price;
    public void setOrderPrice(String price) {
        this.price = price;
    }
    public String getOrderPrice() {
        return price;
    }

String userName;
    public void setOrderUserName(String userName) {
        this.userName = userName;
    }
    public String getOrderUserName() {
        return userName;
    }

    private String productName;

    public void setOrderProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderProductName() {
        return productName;
    }



}
