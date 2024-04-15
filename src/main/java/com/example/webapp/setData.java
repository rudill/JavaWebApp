package com.example.webapp;

public class setData {

    public void setData(String productName, String brand, String price, String category, String description, String fileName) {
        getSetData data = new getSetData();
        data.getProductName(productName);
        data.getBrand(brand);
        data.getPrice(price);
        data.getCategory(category);
        data.getDescription(description);
        data.getFileName(fileName);
    }

    public void getData() {
        getSetData data = new getSetData();
        System.out.println("Product Name: " + data.setProductName());
        System.out.println("Brand: " + data.setBrand());
        System.out.println("Price: " + data.setPrice());
        System.out.println("Category: " + data.setCategory());
        System.out.println("Description: " + data.setDescription());
        System.out.println("File Name: " + data.setFileName());
    }

}
