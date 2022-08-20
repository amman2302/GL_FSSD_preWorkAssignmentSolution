/**
 * @author :  B. Ganesh Kumar <ganesh.vinu@gmail.com)
 */
package com.gl.fssd.preWorkAssignmentSolution;
import java.util.Scanner;


public class Main { 
        /**
         *  function to determine whether the given input is palindrome or not
         * 
         *   The numbers which give the same value when reversed are called palindrome numbers.
         *   Example: 121, 12321, 512215, etc.,
         */
       public void checkPalindrome()  
       {
            int iSum = 0;
            System.out.println("Enter the number to check whether its a palindrom or not");
            Scanner input = new Scanner(System.in);
            int iNumber = input.nextInt();
            int iOrigNumber = iNumber;
            while(iNumber>0)
            {
                iSum = (iSum *10 ) + (iNumber%10);  
                iNumber = iNumber/10;  
            }//End of while
            if(iSum==iOrigNumber) 
                System.out.println("The given number is Palindrome");
            else
                System.out.println("The given number is not a Palindrome");
        }//End of checkPalindrome

        /**
         *  function to print the star pattern in decreasing order forthe given input number
         * Based on the input integer, the levels in the pattern and the number of stars in each level are decided. At every level, the number of stars is 1 less than the previous level.
         * Example: If the input number is 4, then the output will be
            ****
            ***
            **
            *
            if input no is 5, then the output will be
            *****
            ****
            ***
            **
            * 
        */
        public void printPattern() 
        {
            System.out.println("Enter the number of line of stars need to be printed");
            Scanner input = new Scanner(System.in);
            int iNumber = input.nextInt();
            int iPrinted = 0;
            while(iNumber>0)
            {
                while(iPrinted<iNumber)
                {
                    System.out.print("*");
                    iPrinted++;
                }
                System.out.println();
                iNumber--;
                iPrinted = 0;
            }
        }// End of printPattern
        /**
         *  function to determine whether the given input is prime number or not
         * 
         * The numbers which are only divisible by 1 & themselves are called prime numbers. (Or) 
         * The numbers which have factors as 1 and themselves are called prime numbers.
         * Example_1: If the input number is 23
         * Factors of 23 are 1, 23, and other than 1 it  is divisible by 23 only
         * Hence the number is prime.
         * Example_2: If the input number is 22
         * Factors of 22 are 1,2, 11, 22 and are divisible by 2 and 11.
         * Hence the number is not a prime number.
         */
        public void checkPrimeNumber() 
        {
            System.out.println("Enter the number to be checked, whether its a prime or not");
            Scanner input = new Scanner(System.in);
            int iNumber = input.nextInt();
            int iCnt = 2;
            int iFlag = 0;
            while(iCnt<=(iNumber/2))
            {
                if(iNumber%iCnt==0) 
                {    
                    iFlag = 1; 
                    break;
                }   
                iCnt++;     
            }
            if(iFlag==1)
                System.out.println("Its not a prime number");
            else    
                System.out.println("Its a prime number");
        }// End of checkPrimeNumber
         /**
         *  function to print the Fibonacci Series for the given  input 
         *  The series of numbers whose next number is the sum of its previous two numbers is called the Fibonacci series
         * Example_1: If the input number is 5,
         * The Fibonacci series  is: 0, 1, 1, 2, 3 (by default first two numbers are 0,1 (hardcoded), and we need to calculate the other nos in series)
         * Example_2: If the input number is 7
         * The Fibonacci series is: 0, 1, 1, 2, 3, 5 , 8
         */
        public void printFibonacciSeries() 
        {
            System.out.println("Enter the number till the series need to be printed");
            Scanner input = new Scanner(System.in);
            int iSeriesCnt = input.nextInt();
            int iCnt = 0;
            int iPrev1 = 0;
            int iSum = 0;
            int iPrev2=0;
            while(iCnt<iSeriesCnt){
                if(iCnt==1)
                    iPrev2 = iCnt;    
                iSum = iPrev1 + iPrev2;
                System.out.print(iSum);
                System.out.print(",");
               if(iCnt>=2)
                {
                    iPrev1 = iPrev2;
                    iPrev2 = iSum;
                }
                iCnt++; 
            }
        }// End of printFibonacciSeries

            //main method which contains switch and do while loop
      public static void main(String[] args) 
      {
              Main obj = new Main();
              int choice;
              Scanner sc = new Scanner(System.in);
              do 
                {
                        System.out.println(" \n \n Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                        + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                        + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

                        System.out.println();

                        choice = sc.nextInt();

                        switch (choice) 
                        {

                            case 0:
                            choice = 0;
                            break;
                            case 1: 
                            {
                                obj.checkPalindrome();
                            }
                            break;
                            case 2: 
                            {
                                obj.printPattern();
                            }
                            break;
                            case 3: 
                            {
                                obj.checkPrimeNumber();
                            }
                            break;
                            case 4: 
                            {
                                obj.printFibonacciSeries();
                            }
                            break;
                            default:
                            System.out.println("Invalid choice. Enter a valid no.\n");
                        }
                } while (choice != 0);
                System.out.println("Exited Successfully!!!");
                sc.close();
        }
}