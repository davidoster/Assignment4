/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public class Sort {
    private List<TShirt> tShirts;
    
    Sort(List<TShirt> shirts) {
        this.tShirts = shirts;
    }

    public List<TShirt> gettShirts() {
        return tShirts;
    }

    public void settShirts(List<TShirt> tShirts) {
        this.tShirts = tShirts;
    }
    
    /*
    sortMethod = 0, Quick Sort
    sortMethod = 1, Bubble Sort
    sortMethod = 2, Bucket Sort
    sortOrder = 0, ASC
    sortOrder = 1, DESC
    */
    public List<TShirt> sortBySize(int sortMethod, int sortOrder) {
        List<TShirt> shirts = new ArrayList<TShirt>();
        switch(sortMethod) {
            case 0:
                break;
            case 1:
                bubbleSortBySize(sortOrder);
                break;
            case 2:
                break;
        }
        
        return shirts;
    
    }
    
    /*
    sortMethod = 0, Quick Sort
    sortMethod = 1, Bubble Sort
    sortMethod = 2, Bucket Sort
    sortOrder = 0, ASC
    sortOrder = 1, DESC
    */
    public List<TShirt> sortByColor(int sortMethod, int sortOrder) {
        List<TShirt> shirts = new ArrayList<TShirt>();
        switch(sortMethod) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        
        return shirts;
            
    }
    
    /*
    sortMethod = 0, Quick Sort
    sortMethod = 1, Bubble Sort
    sortMethod = 2, Bucket Sort
    sortOrder = 0, ASC
    sortOrder = 1, DESC
    */
    public List<TShirt> sortByFabric(int sortMethod, int sortOrder) {
        List<TShirt> shirts = new ArrayList<TShirt>();
        switch(sortMethod) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        
        return shirts;
        
    }
    
    private List<TShirt> bubbleSortBySize(int type) {
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
                for (int i = 0; i < n-1; i++) {
                    for (int j = 0; j < n-i-1; j++) 
                        if (tempShirts.get(j).getSize().ordinal() < tempShirts.get(j+1).getSize().ordinal()) 
                        { 
                            TShirt temp = tempShirts.get(j); 
                            tempShirts.set(j, tempShirts.get(j+1));
                            tempShirts.set(j+1, temp); 
                        }
                }
                break;
        }
        
        return tempShirts;
    }
    
}
