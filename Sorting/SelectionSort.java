package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void SelectionSort(int[]arr){
        int n= arr.length;
        for(int i = 0;i<n;i++){
            int smallest = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }


    }



    public static void PrintArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
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
        SelectionSort(arr);
        System.out.print("After SelectionSort:-");
        PrintArray(arr);
    }
}
