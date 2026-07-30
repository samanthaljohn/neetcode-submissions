class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            for (int j = i + 1; j < words.length; j++){
                String longerWord = words[j];
                if (longerWord.contains(word)){
                    substrings.add(word);
                    break;
                }
            }
        }

        return substrings;
    }
}