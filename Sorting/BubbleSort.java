package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void sort(int []arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0 ; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void PrintArray(int []arr){
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0; i<5;i++)
        { arr[i]= sc.nextInt();}
        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        System.out.println("Sorted array");
        PrintArray(arr);
    }





}
