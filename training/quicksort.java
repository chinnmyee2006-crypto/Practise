public class quicksort {
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
            System.out.println()
        }
    }