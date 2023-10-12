

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        shuffleArray(nums);
        System.out.print("Shuffled Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] nums) {
        Random rand = new Random();

        for (int i = nums.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Generate a random index between 0 and i (inclusive)

            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
