public class ArrayBasics {
    public static void main(String[] args) {

        int[] x, y;

        x = new int[] { 1, 2, 3, 4, 5 };
        y = x;
        x = new int[] { -1, 2, 5, 4, 99 };
        y = new int[3];

        String[] s = new String[6];
        s[4] = "Ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9, 10, 11};
        System.arraycopy(b, 0, x, 3, 2);
        System.out.println(y);
    }  
}
