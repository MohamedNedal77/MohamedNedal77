/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication161;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class NewClass1 {
     public static double compueArea( double radius){
     double area=Math.PI*Math.pow (radius,2);
     return area ;
     }
       public static double compueArea( double L,double W){
    double area=L*W;
    return area;
       }
        public static double compueArea( double base,double h,boolean isTriagle){
           double area;
            if(true){
             area=1.0/2.0*base*h; 
           }
           else{
               area= base*h;    
                   }
           
            return area;
           
        }
        public static void main(String[] args){
         System.out.println(compueArea(5));
         System.out.println(compueArea(2,4));
         System.out.println(compueArea(4,7, true));
}


    
    
    
    
    
    
    
    
}
