/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compundinterest.java;
import java.util.Scanner;

public class CompundinterestJava10 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        
        double amount = 0;
        
        System.out.println("What is the interest pri? ");
        double pri = in.nextDouble();
        
        System.out.println("What is the interest rate? ");
        double rate = in.nextDouble()/100.0;
        
        System.out.println("What is the number of years? ");
        int years = in.nextInt();
        
        System.out.printf("%s%20s%n","Year","Amount of deposit");
        for(int year = 1; year <= years;year++){
            amount = pri * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n",year,amount);
        }
        double intrestAmount = amount - pri;
        double yield = intrestAmount/pri*100;
        System.out.printf("Pri amount: %.2f %n",pri);
        System.out.printf("interest amount: %.2f %n",intrestAmount);
        System.out.printf("Total amount: %.2f %n",amount);
        System.out.printf("Total yield: %.2f %n",yield);
    }
   }
