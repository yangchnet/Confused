import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] data;
    public Map<Integer, Integer> holder;

    public Solution(int[] data){
        this.data = data;
        this.holder = new HashMap<>(data.length);
    }

    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(!holder.containsKey(nums[i])){   //不包含
                holder.put(nums[i], 1);
            }else{
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2,3, 1, 0, 2, 5, 3};
        Solution s = new Solution(data);
        System.out.println(s.findRepeatNumber(data));
    }
}
