package sorting;

import java.util.Arrays;

public class bubble_sort {
    // bubble sort
    // time complexity O(n^2)
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }


    public static void main(String[] args) {
        int[] arr={12,3,45,56,67,123,44,34,34,3,343,56,67,64534,5};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);

    }
}
