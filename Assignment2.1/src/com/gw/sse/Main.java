package com.gw.sse;

public class Main {

    public static void main(String [] args) {
        double total = 0;
        String[] name = {"-1", "Hello", "2.5", "3", "4.9", "10"};
        for(int i = 0; i < name.length; i++){
            try{
                total = total + Double.parseDouble(name[i]);
            }
            catch(Exception e){
                System.out.println("An improper number was entered and ignored.");
            }
        }
        System.out.println("Your total is " + total);
    }
}