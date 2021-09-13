/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exArea {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int len = sc.nextInt();
        System.out.println("What is the length of the room in feet?");
        int width = sc.nextInt();
        int ftArea = len*width;
        double mArea = ftArea* 0.09290304;
        System.out.println("You entered dimension of " + len + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(ftArea + " square feet");
        System.out.printf("%.3f square meters", mArea);
    }
}
