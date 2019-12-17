/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author George.Pasparakis
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<TShirt> tShirts = new ArrayList<TShirt>();
//        long startTime = System.currentTimeMillis();
//        tShirts = generateTShirts(4000,0); 
//        long endTime = System.currentTimeMillis();
//        System.out.println("Generation of 40 TShirts (type 0) on: " +
//                (endTime - startTime));
        
        long startTime = System.currentTimeMillis();
        tShirts = generateTShirts(10,1);
        long endTime = System.currentTimeMillis();
        System.out.println("Generation of 40 TShirts (type 1) on: " + 
                (endTime - startTime));
        System.out.println("UnSorted Array");
        printTShirts(tShirts);
        System.out.println("Sorted Array");
        printTShirts(bubbleSortSize(tShirts,0));
        
    }
    
    public static List<TShirt> generateTShirts(int count, int type) {
        List<TShirt> tShirts = new ArrayList<TShirt>();
        for(int i = 0; i < count; i++) {
            TShirt e = new TShirt();
            e.setName(randomName(type));
            e.setColor(randomColor());
            e.setSize(randomSize());
            e.setFabric(randomFabric());
            tShirts.add(e);
        }
        return tShirts;
    }
    
    /*
    type = 0, String concatenation
    type = 1, StringBuilder
    */
    public static String randomName(int type) {
        char chars[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Random random = new Random();
        String s = "";
        switch(type) {
            case 0:
                for(int i = 0; i < 12; i++) {
                    s += chars[random.nextInt(26)];
                }
                break;
            case 1:
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < 12; i++) {
                    sb.append(chars[random.nextInt(26)]);
                }
                s = sb.toString();
                break;
        }
        return s;
    }
    public static Color randomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }
    
    public static Size randomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
    
    public static Fabric randomFabric() {
        Random random = new Random();
        return Fabric.values()[random.nextInt(Fabric.values().length)];
    }
    
    /*
    type = 0, ASC
    type = 1, DESC
    */
    public static List<TShirt> bubbleSortSize(List<TShirt> tShirts, int type) 
    { 
        int n = tShirts.size(); 
        List<TShirt> tempShirts = tShirts;
        switch(type) {
            case 0:
                for (int i = 0; i < n-1; i++) {
                    for (int j = 0; j < n-i-1; j++) 
                        if (tempShirts.get(j).getSize().ordinal() > tempShirts.get(j+1).getSize().ordinal()) 
                        { 
                            TShirt temp = tempShirts.get(j); 
                            tempShirts.set(j, tempShirts.get(j+1));
                            tempShirts.set(j+1, temp); 
                        }
                }
                break;
            case 1:
                break;
        }
        
        return tempShirts;
    } 
    
    public static void printTShirts(List<TShirt> tShirts) {
        for(TShirt e: tShirts) {
            System.out.println(e.getName() + " " + e.getSize());
        }
    }

}
