package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSum {

    public static int arraysSum(int[] arr){
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] =new int[n];


        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraysSum(arr));

    }


}
