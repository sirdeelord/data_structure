public class InsertionSort {
    public static void main(String[] args) {
        
    }

    public void iSort(int arr[]) {
        int pos;
        int val;
        for (int i = 0; i < arr.length; i++) {
            val = arr[i];
            pos = i;
            while (pos >= 0 && arr[pos - 1] > val) {
                arr[pos] = arr[pos - 1];
                pos = pos - 1;
            }
            arr[pos] = val;
        }
    }
}
