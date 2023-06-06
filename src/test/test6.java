package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class test6
{
   private test6(){

   }
    // no of students of any number
    // each student have 3 subjects
    // if any student gets less tha 33 marks in any subjects
    // show the message you are not passed, failed in the exam

    // if some having more than 33 number
    // show message you have passed
    public static void main(String[] args)
    {
        Map<String, String> stduentData = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int[] subjects = new int[1000];
        int firstSubject, secondSubject, thirdSubject;
        System.out.println("Enter the number of student data you want to store");
        int no = sc.nextInt();

        for(int i = 0;i < no;i++) {
            System.out.println("Enter the first subject marks");
            firstSubject = sc.nextInt();
            System.out.println("Enter the second subject marks");
            secondSubject = sc.nextInt();
            System.out.println("Enter the third subject marks");
            thirdSubject = sc.nextInt();
            System.out.println("Enter the name of the student");
            String str = sc.nextLine();

            subjects[0] = firstSubject;
            subjects[1] = secondSubject;
            subjects[2] = thirdSubject;
            boolean val = addNumber(subjects);
            if (val == true) {

                System.out.println("Student Passed");
            } else {

                System.out.println("Student Failed");
            }

        }

    }

    public static boolean addNumber(int[] arr)
    {
        double sum =  0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        double val = (sum/300)*100;
        System.out.println(val);
        if(val < 33){
            return false;
        }
        else {
            return true;
        }
    }
}
