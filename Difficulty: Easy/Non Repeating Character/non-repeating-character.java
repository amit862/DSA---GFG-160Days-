class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '$';
    }
}
