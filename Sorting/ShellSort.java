package Sorting;

public class ShellSort {
        public static void ShellSort(int[] arr , int n ) {
            for (int gap = n / 2; gap > 0; gap = gap / 2) {
                for (int j = gap; j < n; j++) {
                    for (int i = j - gap; i >= 0; i = i - gap) {
                        if (arr[i + gap] > arr[i]) {
                            break;
                        } else {
                            int temp = arr[i + gap];
                            arr[i + gap] = arr[i];
                            arr[i] = temp;


                        }
                    }
                }
            }
        }



            public static void display(int [] arr){

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");

                }
                System.out.println();
            }


            public static void main (String args[]){
            //77,62,14,9,30,21,80,25,70,55
                int arr[] = {23,29,15,19,31,7,9,5,2};
                System.out.print("Before Sorting:-");
                display(arr);
                ShellSort(arr, arr.length);
                System.out.print("After ShellSort:-");
                display(arr);

            }
}
