package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        User manager = new User("Sahil", "sahil@gmail.com", "sa12@co.in");
        User developer = new User("Surabhi", "sahil@gmail.com", "sur123@bhi.in");
        User tester = new User("Mohita", "sahil@gmail.com", "mohi@21.co.in");

        System.out.println("Manager" + manager);
        System.out.println("Developer" + developer);
        System.out.println("Tester" + tester);
    }
}
