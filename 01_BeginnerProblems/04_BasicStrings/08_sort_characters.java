import java.util.*;

class Solution {    
    public List<Character> frequencySort(String s) {
    Map<Character, Integer> freq = new HashMap<>();

    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }

    List<Character> chars = new ArrayList<>(freq.keySet());

    chars.sort((a, b) -> {
        int frequencyCompare = Integer.compare(freq.get(b), freq.get(a));

        if (frequencyCompare != 0) {
            return frequencyCompare;
        }

        return Character.compare(a, b);
    });

    return chars;
}


}


class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "tree";
        List<Character> sortedChars = solution.frequencySort(s);
        System.out.println(sortedChars);
    }
}