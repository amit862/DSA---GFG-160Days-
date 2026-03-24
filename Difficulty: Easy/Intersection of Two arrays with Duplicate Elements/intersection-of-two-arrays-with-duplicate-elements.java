class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
    HashSet<Integer> setA = new HashSet<>();
    HashSet<Integer> resultSet = new HashSet<>();
    
    for(int num : a) {
        setA.add(num);
    }
    
    for(int num : b) {
        if(setA.contains(num)) {
            resultSet.add(num);
        }
    }
    return new ArrayList<>(resultSet);
    }
}