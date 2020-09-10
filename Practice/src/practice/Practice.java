/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        double balance = 1000.00;
        System.out.println("Press 1 if you want to deposit!");
        System.out.println("Press 2 if you want to withdraw!");
        System.out.println("Press 3 if you want to see your current balance!");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + balance);
                System.out.println("Enter the amount you want to deposit: ");
                double amount = scan.nextDouble();
                System.out.println("Your current balance is: " + (balance + amount));
                break;
            case 2:
                System.out.println("Your current balance is: " + balance);
                System.out.println("Enter the amount you want to withdraw: ");
                double amounttowithdraw = scan.nextDouble();
                System.out.println("Your current balance is: " + (balance - amounttowithdraw));
                break;
            case 3:
                System.out.println("Your current balance is: " + balance);
        }
    }
}
