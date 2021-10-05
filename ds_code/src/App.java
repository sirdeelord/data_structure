public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {

        // for (int i : nums) {
            // if (i == 1) {

            if (nums[i] == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= nums.length / 2) {
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }
}
