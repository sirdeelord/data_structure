public class SelectionSort {
    public static void main(String[] args) {
        
    }

    public void sSort(int arr[]) {
        // loop through the given array
        for (int i = 0; i < arr.length - 1 ; i++) {
            // find the minimum value in the array
            int minVal = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[minVal]) {
                    minVal = j;
                }
            }
            int temp = arr[minVal];
            arr[minVal] = arr[i];
            arr[i] = temp;
        }
    }
}
