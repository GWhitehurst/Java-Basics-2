package com.gw.sse;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 7;
	    int[][] arr = new int[rows][cols];
        System.out.println("Populating array...");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
        System.out.println("Searching for largest value...");
        int max = 0;
        int maxRow = -1;
        int maxCol = -1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Largest value is " + max + " found at " + maxRow + ", " + maxCol);
    }
}
