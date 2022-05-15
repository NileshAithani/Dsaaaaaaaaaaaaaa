package Sorting;

import java.util.Scanner;

public class MergeSort {


    void merge(int arr[], int l, int m, int r) {
        int index1 = m - l + 1;
        int index2 = r - m;

        int L[]=new int[index1] ;
        int R[]=new int[index2];

        for (int i = 0; i < index1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < index2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < index1 && j < index2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < index1) {
            arr[k++] = L[i++];
        }
        while (j < index2) {
            arr[k++] = R[j++];
        }
    }


    void mergeSort(int arr[], int l, int r)
    {
        if(l<r){
            int m=l+(r-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l,m,r);
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
            MergeSort ob = new MergeSort();
            ob.mergeSort(arr, 0, 4);
            System.out.println("Sorted array");
            PrintArray(arr);
        }
    }


