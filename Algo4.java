public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        // Assigning the array into opposit sequence
        for (int i = 0; i < nums.length/2; i++) {
            int tempNum = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = tempNum;
        }

        System.out.println();

        // Displaying the nums array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }

        System.out.print("\b\b");
        System.out.println("  ");
        System.out.println();
    }
}
