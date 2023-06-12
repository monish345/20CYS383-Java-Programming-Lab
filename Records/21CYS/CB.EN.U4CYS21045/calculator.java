package com.amrita.cys21045;

import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of First Number : ");
        int a=sc.nextInt();
        if(a>=0){
            System.out.print("Enter the Value of Second Number : ");
            int b=sc.nextInt();
            if(b>=0){
                System.out.println("Operations : ");
                System.out.println("\tAddition : + ");
                System.out.println("\tSubtraction : - ");
                System.out.println("\tMultiplication : * ");
                System.out.println("\tDivision : / ");
                System.out.print("Enter a Choice :  ");
                String c=sc.next();
                if(c.equals("+")){
                    int t=a+b;
                    System.out.println("Addition of Two Numbers is : "+t);
                }
                else if(c.equals("-")){
                    int t=a-b;
                    System.out.println("Subtraction of Two Numbers is : "+t);
                }
                else if(c.equals("*")){
                    int t=a*b;
                    System.out.println("Multiplication of Two Numbers is : "+t);
                }
                else if(c.equals("/")){
                    int t=a/b;
                    System.out.println("Division of Two Numbers is : "+t);
                }
                else{
                    System.out.println("Enter a Valid Operator !");
                }
            }else{
                System.out.println("Enter a Positive Integer ! ");
            }
        }else{
            System.out.println("Enter a Positive Integer ! ");
        }
    }
}