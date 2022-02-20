package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfBigInt {


    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        long newArr[]=Arrays.stream(arr).asLongStream().toArray();
        List<Long> arrayList=new ArrayList<>();
        for (int i=0;i<n;i++){
            newArr[i]= sc.nextInt();
        }

        for (int i=0;i<newArr.length;i++){
            arrayList.add((newArr[i]));
        }

        long[] i = sumOfBigInt(arrayList);
        System.out.println(i);
    }

    private static long[] sumOfBigInt(List<Long> newArr) {

      return   Arrays.stream(new long[]{newArr.stream().mapToLong(Long::longValue).sum()}).toArray();

    }

}
