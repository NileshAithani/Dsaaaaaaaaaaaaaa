package sem2;

public class bubbleSort {
    public void printArray(int []arr ){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public void bubblesort(int [] arr){
        int n = arr.length;
        boolean isSwap ;
        for(int i = 0 ; i<n-1;i++){
            isSwap = false;
            for (int j = 0 ; j<n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                isSwap = true ;
                }
            if(isSwap==false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [ ] arr = {4,1,3,5,9,10,11,7,3};

        bubbleSort ob = new bubbleSort();
        ob.printArray(arr);
        System.out.println();

        ob.bubblesort(arr);
        ob.printArray(arr);

    }
}
