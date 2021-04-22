class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n:nums) {
            if (n>=0) map.put(n,1);
        }
        for (int i=1;i<map.size()+2;i++) {
            if (!map.containsKey(i)) return i;
        }
        return map.size()==0?1:map.size();
    }
}
