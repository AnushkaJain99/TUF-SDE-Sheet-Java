public class MissingRepeating {

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }

            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int[] ans = findMissingRepeatingNumbers(nums);

        System.out.println("Duplicate = " + ans[0]);
        System.out.println("Missing = " + ans[1]);
    }
}