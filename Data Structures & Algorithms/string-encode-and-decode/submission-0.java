class Solution {

    private final String separator = "#";

    public String encode(List<String> strs) {
        final StringBuilder builder = new StringBuilder();

        for (String s : strs) {
            builder.append(s.length() + separator).append(s);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        final ArrayList result = new ArrayList();
        if (str.length() == 0) {
            return result;
        }
        int startFrom = 0;
        while (startFrom < str.length()) {
            int separatorIndex = str.indexOf(separator, startFrom);
            if (separatorIndex < 0) {
                return result;
            }
            final int size = Integer.valueOf(str.substring(startFrom, separatorIndex));
            startFrom = separatorIndex + size + 1;
            result.add(str.substring(separatorIndex + 1, startFrom));
        }
        return result;
    }
}
