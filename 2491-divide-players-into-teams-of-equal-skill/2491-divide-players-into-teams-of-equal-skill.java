class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int sum = skill[0] + skill[n-1];
        long res = 0;
        for(int i=0;i<n/2;i++){
            if(skill[i] + skill[n-i-1] == sum){
                res += (skill[i] * skill[n-i-1]);
            } else {
                return -1;
            }
        }
        return res;
    }
}