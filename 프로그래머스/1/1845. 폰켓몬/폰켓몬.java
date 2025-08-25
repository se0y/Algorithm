import java.util.*; 

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        // nums에서 중복 빼고 종류 몇 개있는지 구하면 됨
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        // n/2 이상 뽑을 수 없으므로, n/2이랑 set.size() 둘 중에 더 작은 값을 리턴
        return Math.min(set.size(), n/2);
    }
}