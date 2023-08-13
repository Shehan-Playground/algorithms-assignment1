public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        int[] newArray = new int[5];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums.length-1-i];
        }

        nums = newArray;

        System.out.println();

        // Printing opposit sequence
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("\b\b");
        System.out.println("  ");
        System.out.println();

    }
}
