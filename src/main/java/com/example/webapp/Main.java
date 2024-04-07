package com.example.webapp;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver is in the classpath.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver is not in the classpath.");
        }
    }
}
