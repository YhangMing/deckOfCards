/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        App app = new App();

        while (true) {
            System.out.println("-----Menu Bar-----");
            System.out.println(" Enter 1 -- for CREATE");
            System.out.println(" Enter 2 -- for SHUFFLE ");
            System.out.println(" Enter 3 -- for DEAL ");
            System.out.println(" Enter 4 -- for DISPLAY");
            System.out.print("Enter your Choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    app.createDeck();
                    break;
                case 2:
                    app.shuffle();
                    break;
                case 3:
                    app.deal();
                    break;

                case 4:
                    app.displayDeck();
                    break;
                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }

}
