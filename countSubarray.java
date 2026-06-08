import java.util.*;

public class countSubarray {

    public static int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;

        map.put(0, 1);

        for (int num : nums) {
            xor ^= num;

            int x = xor ^ k;

            count += map.getOrDefault(x, 0);

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(subarraysWithXorK(nums, k));
    }
}