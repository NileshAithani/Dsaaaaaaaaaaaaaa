package Sorting;

public class RadixSort {

    public static int getMax(int[]arr , int n ){
        int max = arr[0];
        for(int i = 1 ; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void countsort(int arr[] , int n , int exp){
        int [] C = new int[10];
        int [] B = new int[n];
        for(int i = 0 ; i<n ; i++){
            C[(arr[i] / exp) % 10]++;
        }
        for(int i = 1 ; i<10;i++){
            C[i]=C[i]+C[i-1];
        }
        for(int i = n-1 ; i>=0 ; i-- ){
            B[--C[(arr[i]/exp)%10]]=arr[i];
        }
        for(int i = 0 ; i<n ; i++){
            arr[i]=B[i];
        }
    }


    public static void radixsort(int []arr ,int n ){
        int m = getMax(arr , n);

        for(int exp = 1  ; m/exp >0 ; exp=exp*10){
            countsort(arr,n,exp);
        }
    }

    public static void PrintArray(int []arr){
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {


        int []arr = {432 ,8,530,90,88,231,11,45,677,199};
        int n = arr.length;


        System.out.print("Before Sorting :-");
        PrintArray(arr);
        System.out.println();
        radixsort(arr,n);
        System.out.print("After RadixSort:-");
        PrintArray(arr);


    }

}
