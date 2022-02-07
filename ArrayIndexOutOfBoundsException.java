/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11;

/**
 *
 * @author Rsm
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int array[] = {2,3,4};
        try {
            System.out.println(array[4]);
        }catch(Exception e) {
            System.out.println("Index array : 3");
        }
    }
}
