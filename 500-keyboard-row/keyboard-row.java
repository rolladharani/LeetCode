class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isInRow(lowerWord, row1) || isInRow(lowerWord, row2) || isInRow(lowerWord, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean isInRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;

    }
}