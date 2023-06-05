package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean solution(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }
}
