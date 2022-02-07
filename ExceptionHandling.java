/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rsm
 */
public class ExceptionHandling {
    public static void main(String[] args) {
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
