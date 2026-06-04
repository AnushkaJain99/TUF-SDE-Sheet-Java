public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];

        for (int num : nums) {
            if (freq[num] > 0) {
                return num;
            }
            freq[num]++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }
}