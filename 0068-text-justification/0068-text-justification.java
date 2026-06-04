class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int lineLength = 0;

            // Find words that fit in current line
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int numWords = j - i;
            StringBuilder sb = new StringBuilder();

            // Last line or single word -> left justify
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }

                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } 
            // Fully justify
            else {
                int totalSpaces = maxWidth - lineLength;
                int gaps = numWords - 1;

                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);

                    if (k < j - 1) {
                        int spaces = spacesPerGap;

                        if (extraSpaces > 0) {
                            spaces++;
                            extraSpaces--;
                        }

                        for (int s = 0; s < spaces; s++) {
                            sb.append(" ");
                        }
                    }
                }
            }

            result.add(sb.toString());
            i = j;
        }

        return result;
    }
}