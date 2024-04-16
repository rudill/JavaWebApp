package com.example.webapp;

public class setData {

    public void setData(String productName, String brand, String price, String category, String description, String fileName) {
        productData data = new productData();
        data.setProductName(productName);
        data.setBrand(brand);
        data.setPrice(price);
        data.setCategory(category);
        data.setDescription(description);
        data.setFileName(fileName);
    }

    public void getData() {
        productData data = new productData();
        System.out.println("Product Name: " + data.getProductName());
        System.out.println("Brand: " + data.getBrand());
        System.out.println("Price: " + data.getPrice());
        System.out.println("Category: " + data.getCategory());
        System.out.println("Description: " + data.getDescription());
        System.out.println("File Name: " + data.getFileName());
    }

}
