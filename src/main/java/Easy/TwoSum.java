package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public int[] Solution(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++){
            int res = target - nums[i];
            for(int j = i + 1; j < nums.length && nums[j] <= target; j++) {
                if (res == nums[j]) return new int[] {i, j};
            }
        }
        return new int[2];
    }
}
