import java.util.*;

public class StringIbmHard {

    static Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    // distance to nearest vowel
    static int distToVowel(char ch) {
        int min = Integer.MAX_VALUE;
        for (char v : vowelsSet) {
            min = Math.min(min, Math.abs(ch - v));
        }
        return min;
    }

    // distance to nearest consonant
    static int distToConsonant(char ch) {
        int min = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!vowelsSet.contains(c)) {
                min = Math.min(min, Math.abs(ch - c));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String str = "OmNarayan mishra".toLowerCase();

        List<Integer> vowelToConsonantCosts = new ArrayList<>();
        List<Integer> consonantToVowelCosts = new ArrayList<>();

        int vowels = 0, consonants = 0;

        // Count and collect conversion costs
        for(char ch : str.toCharArray()) {
            if (ch < 'a' || ch > 'z') continue; // ignore non-letters

            if (vowelsSet.contains(ch)) {
                vowels++;
                vowelToConsonantCosts.add(distToConsonant(ch));
            } else {
                consonants++;
                consonantToVowelCosts.add(distToVowel(ch));
            }
        }

        // If equal already
        if (vowels == consonants) {
            System.out.println("Minimum operations = 0");
            return;
        }

        int diff = Math.abs(vowels - consonants);

        // Sort costs
        Collections.sort(vowelToConsonantCosts);
        Collections.sort(consonantToVowelCosts);

        int operations = 0;

        if (vowels > consonants) {
            // Convert diff vowels → consonants
            for (int i = 0; i < diff; i++)
                operations += vowelToConsonantCosts.get(i);
        } else {
            // Convert diff consonants → vowels
            for (int i = 0; i < diff; i++)
                operations += consonantToVowelCosts.get(i);
        }

        System.out.println("Minimum operations = " + operations);
    }
}
