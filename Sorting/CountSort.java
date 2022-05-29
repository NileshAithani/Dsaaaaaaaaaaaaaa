package Sorting;

import java.util.Scanner;

public class CountSort {


    public static void count(int arr[] , int n , int k){
        int [] C = new int[k+1];
        int [] B = new int[n];
        for(int i = 0 ; i<n ; i++){
            C[arr[i]]++;
        }
        for(int i = 1 ; i<=k;i++){
            C[i]=C[i]+C[i-1];
        }
        for(int i = n-1 ; i>=0 ; i-- ){
            B[--C[arr[i]]]=arr[i];
        }
        for(int i = 0 ; i<n ; i++){
            arr[i]=B[i];
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
            int arr[] = new int[8];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array elements");
            for (int i = 0; i < 8; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Before Sorting :-");
            PrintArray(arr);
            System.out.println();
            count(arr,8,5);
            System.out.print("After CountSort:-");
            PrintArray(arr);
        }

    }

