/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;/**
 *
 * @author hp
 */
public class TugasArray {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int[]kali = new int[100]; 
        printArray(kali);   
     }
     
      public static void printArray(int[] data){
        Scanner sc = new Scanner(System.in);
        int m=0;
        
        for(int i=0;i <data.length;i++){
            System.out.print("Masukkan nilai ke- "+(i+1)+" = ");
            data[i]=sc.nextInt();
            if (data[i]<0){
                m=i;
                break;
            }
          }
        
        int min=data[0];
        int max=data[0];
        
        System.out.println();
        
        for(int i=0;i<m;i++){
            if(data[i]>max){
                max=data[i];
            }
            else if(data[i]<min){
                min=data[i];
            }
        }
        System.out.println("Nilai max ="+ min);
        System.out.println("Nilai min = "+ max);
     }
}
