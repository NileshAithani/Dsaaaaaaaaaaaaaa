package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void QuickSort(int[]arr  , int l , int e){
        if(l>=e){
            return;
        }
        int p = partition(arr,l,e);

        QuickSort(arr,l , p-1);
        QuickSort(arr,p+1,e);


    }

    public static int partition(int arr[] , int l ,int e){
        int pivot = arr[e];
        int i = l-1;
        for(int j = l ; j<=e-1;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;

        return i+1;

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
        QuickSort(arr,0,4);
        System.out.print("After QuickSort:-");
        PrintArray(arr);
    }



}
