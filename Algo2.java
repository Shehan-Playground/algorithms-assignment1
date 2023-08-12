public class Algo2 {
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;

        int smallNum = nums[0];
        int largeNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallNum) smallNum = nums[i];
            else if (nums[i] > largeNum) largeNum = nums[i];

        }

        System.out.println("Smallest number: " + smallNum);
        System.out.println("Largest number: " + largeNum);



    }
}
