package Sorting;

public class HeapSort {

    public  void heapify(int [] arr , int n , int i){

        int largest = i ;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[largest]<arr[l]){
            largest=l;
        }

        if(r<n && arr[largest]<arr[r]){
            largest = r ;
        }
        if(largest!=i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i]=temp;

            heapify(arr,n , largest);
        }
    }

    
    public void heapsort(int[]arr  ) {
        int n = arr.length;
        for (int i = (n / 2) + 1 ; i>=0 ; i--){
            heapify(arr,n,i);
        }
        for( int i =n-1 ; i>0 ; i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }

    }



    static void  printA(int arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
            //System.out.println();
        }
    }

        public static void main(String[] args) {
            int arr[]={4,1,3,2,16,9,10,14,8,7};
            int n = arr.length;

            HeapSort obj = new HeapSort();
            obj.heapsort(arr);
            printA(arr);

    }
}
