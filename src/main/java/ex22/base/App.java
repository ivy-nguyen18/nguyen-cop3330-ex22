/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package ex22.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = input.nextInt();

        if(n1 != n2 && n2 != n3){
            System.out.println("The largest number is " + getMax(n1,n2,n3) + ".");
        }
    }

    public static int getMax(int n1, int n2, int n3){
        int max = n1;
        if(max < n2){
            max = n2;
        }
        if(max < n3){
            max = n3;
        }

        return max;
    }
}