class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        if (n % 2 != 0) {
            return -1;
        }
        int expectedSum = skill[0] + skill[n - 1];
        long result = 0;
        for (int i = 0; i < n / 2; i++) {
            int pairedSum = skill[i] + skill[n - i - 1];
            if (pairedSum != expectedSum) {
                return -1;
            }
            result += (long) skill[i] * skill[n - i - 1];
        }
        return result;
    }
}
