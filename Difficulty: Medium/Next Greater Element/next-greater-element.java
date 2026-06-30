class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize answer list
        for (int i = 0; i < n; i++) {
            ans.add(-1);
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Next greater element
            if (!stack.isEmpty()) {
                ans.set(i, stack.peek());
            }

            // Push current element
            stack.push(arr[i]);
        }

        return ans;
    }
}