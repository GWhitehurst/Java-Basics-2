package com.gw.sse;

public class Main {

    public static void main(String [] args) {
        double total = 0;
        for(int i = 0; i < args.length; i++){
            try{
                total = total + Double.parseDouble(args[i]);
            }
            catch(Exception e){
                System.out.println("An improper number was entered and ignored.");
            }
        }
        System.out.println("Your total is " + total);
    }
}