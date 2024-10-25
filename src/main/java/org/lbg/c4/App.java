package org.lbg.c4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num;
        System.out.println("Input a max value till which fizzbuzz must be doneee");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int x = 0; x <= num; x++){
            System.out.println(fizzBuzz(x));
        }
        sc.close();

    }

    public static String fizzBuzz(int x){
        if(x%3==0 && x%5==0){
            return "FizzBuzz";
        }
        if(x%3 == 0){
            return "Fizz";
        }
        if(x%5 == 0){
            return "Buzz";
        }
        return Integer.toString(x);

    }
}

