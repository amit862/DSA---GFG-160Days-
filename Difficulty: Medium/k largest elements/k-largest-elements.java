class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       for(int num : arr) {
           if(pq.size() < k) {
               pq.add(num);
           }
           else if(num > pq.peek()) {
               pq.poll();
               pq.add(num);
           }
       }
       ArrayList<Integer> result = new ArrayList<>();
       
       while(!pq.isEmpty()) {
           result.add(pq.poll());
       }
       Collections.sort(result, Collections.reverseOrder());
       return result;
    }
}
