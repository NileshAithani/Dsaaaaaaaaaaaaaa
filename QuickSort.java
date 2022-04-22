package sem2;

public class QuickSort {
    public static void quicksort(int arr[], int s ,int e){
        if(s>=e){
            return ;
        }
        int p = partition(arr,s,e);
        quicksort(arr,s,p-1);
        quicksort(arr,p+1,e);


    }
public static int partition(int arr[],int s,int e){
        int pivot = arr[e];
        int i =s-1;
        for(int j=s; j<=e-1 ; j++){
            if(arr[j]<=pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp ;
            }
        }

        int temp = arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;

        return i+1;
}
public static void print(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}

    public static void main(String[] args) {
        //QuickSort o = new QuickSort();
        int arr[]={1,3,2,5,12,45,1,2,5,4,98,12,34,54};
        int n = arr.length;
        quicksort(arr,0,n-1);
        System.out.println();
        print(arr);

    }
}
