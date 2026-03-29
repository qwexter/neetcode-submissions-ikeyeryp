class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        final Map<Integer, Integer> store = new HashMap<>();

        for (int n : nums) {
            if (store.get(n) == null) {
                store.put(n, 0);
            }
            store.put(n, store.get(n) + 1);
        }

        final Comparator<Map.Entry<Integer, Integer>> comp = (e1, e2) -> {
            return e1.getValue().compareTo(e2.getValue());
        };
        final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(comp);
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        final int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : queue) {
            result[i++] = entry.getKey();
        }

        return result;
    }
}
