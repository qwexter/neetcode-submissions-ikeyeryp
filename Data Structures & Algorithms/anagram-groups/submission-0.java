    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            final int alphabetSize = 26;

            final Map<String, List<String>> store = new HashMap();

            for (String str : strs) {
                final int[] key = new int[alphabetSize]; 

                for (char c : str.toCharArray()) {
                    key[c - 'a'] +=1;
                }

                final String k = Arrays.toString(key);
                if (!store.containsKey(k)) {
                    store.put(k, new ArrayList<String>());
                }
                ((ArrayList<String>)store.get(k)).add(str);
            }

            return new ArrayList(store.values());
        }
    }
