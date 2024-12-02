class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> set = new HashSet<>();
        for(int i:arr){
            double val = Double.valueOf(i);
            if(set.contains(val*2) || set.contains(val/2)){
                return true;
            } else{
                set.add(val);
            }
        }
        return false;
    }
}