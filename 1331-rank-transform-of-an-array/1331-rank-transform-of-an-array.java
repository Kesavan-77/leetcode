class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        Arrays.sort(temp);
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int val : temp) {
            if (!rankMap.containsKey(val)) {
                rankMap.put(val, rank++);
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = rankMap.get(arr[i]);
        }
        return res;
    }
}
