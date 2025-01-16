package Search_Sort;

// Use Quick Sort to sort the arr in an ascending order

public class question57 {
    public void QuickSort(){
        int arr[] = {23, 44, 12, 9, 3, 24, 58, 134, 96, 91};
        QuickSortHelper(arr,0, arr.length-1);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }

    public void QuickSortHelper(int[]arr, int left, int right){
        if (left < right){
            int pivotIndex = partition(arr, left, right);
            QuickSortHelper(arr, left, pivotIndex - 1);
            QuickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public int partition(int[]arr, int left, int right){
        int pivot = arr[right];
        int i = left -1;

        for(int j = left; j<right; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

}
