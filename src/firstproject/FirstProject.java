/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter your number : ");
        String number = input.nextLine();

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.split("")[i]);
            System.out.println(number.charAt(i));
        }
        System.out.println("Sum is :" + sum);

        if (sum > 9) {
            while (sum > 9) {
              sum =  FirstProject.getSum(sum);
            }
            System.out.println("New sum is : " + sum);
        }
    }

    public static int getSum(int number) {
        int sum = 0, remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }
        
        return sum;
    }

}
