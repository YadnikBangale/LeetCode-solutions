class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int weight = 0;
        char map[] = new char[words.length];
        for(int i = 0 ; i < words.length ; i++) {
            weight = 0;
            char alph[] = words[i].toCharArray();

            for(int j = 0 ; j < alph.length; j++)  {
                weight += weights[alph[j]-'a'];
            }       

            weight = weight % 26;
            map[i] = (char)('z'-weight);
        }

        return new String(map);

    }
}