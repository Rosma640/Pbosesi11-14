/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotugas11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaException {
public static void main(String[] args) {
        int array[] = {2,3,4};
        try {
            System.out.println(array[4]);
        }catch(Exception e) {
            System.out.println("Index array : 3");
        }
        Scanner in = new Scanner(System.in);
       
       int a;
       try{
           System.out.println("Masukan nomor: ");
           a = in.nextInt();
           System.out.println("nomor: "+a);
       }catch(InputMismatchException ea){ 
           System.out.println("Input salah!");
       }
    }
}
