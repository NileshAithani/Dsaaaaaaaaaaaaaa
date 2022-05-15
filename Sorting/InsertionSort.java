package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void InsertionSort(int[]arr){
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            int copy = arr[i];
            while(j>=0 && copy<arr[j] ){
                arr[j+1]=arr[j];
                j--;
                }
            arr[j+1]=copy;
        }
    }



    public static void PrintArray(int []arr){
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting :-");
        PrintArray(arr);
        System.out.println();
        InsertionSort(arr);
        System.out.print("After InsertionSort:-");
        PrintArray(arr);
    }
}
