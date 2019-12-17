/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public interface Sorter<T> {
    List<T> sort(List<T> arrayToSort);
    
}
