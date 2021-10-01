public class InsertionSort {
    public static void main(String[] args) {
        
    }

    public void iSort(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int pos = i - 1;
            while (pos >= 0 && arr[pos] > temp) {
                arr[pos + 1] = arr[pos];
                pos = pos - 1;
            }
            arr[pos + 1] = temp;
        }
    }
}
