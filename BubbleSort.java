package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {15,11,9,3,2,6};

        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
