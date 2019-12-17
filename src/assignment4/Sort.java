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
        shirts = this.tShirts;
        switch(sortMethod) {
            case 0:
                shirts = quickSortBySize(shirts, 0, shirts.size()-1);
                break;
            case 1:
                shirts = bubbleSortBySize(sortOrder);
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
    
    private int quickPartition(List<TShirt> arr, int low, int high) 
    { 
        TShirt pivot = arr.get(high);  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i); 
                arr.set(i, arr.get(j)); 
                arr.set(j, temp); 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);
        return i+1; 
    }
    
    public List<TShirt> quickSortBySize(List<TShirt> arr, int low, int high) 
    { 
        List<TShirt> arr2 = arr; 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = quickPartition(arr2, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quickSortBySize(arr2, low, pi-1); 
            quickSortBySize(arr2, pi+1, high); 
        } 
        return arr2;
    } 
    
}
