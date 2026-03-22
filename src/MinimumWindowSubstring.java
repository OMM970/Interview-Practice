import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapst = new HashMap<>();
        int need = 0;
        int have = 0;
        int l = 0;
        int shortlen = Integer.MAX_VALUE;
        int start = 0;


        for (char c : t.toCharArray()) {
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        need = maps.size();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (maps.containsKey(c)) {
                mapst.put(c, mapst.getOrDefault(c, 0) + 1);

                if (mapst.get(c).intValue() == maps.get(c).intValue()) {
                    have++;
                }
            }
            while (have == need) {
                char c1 = s.charAt(l);
                int length = r - l + 1;
                if (length < shortlen) {
                    shortlen = length;
                    start = l;
                }
                if (maps.containsKey(c1)) {
                    mapst.put(c1, mapst.get(c1) - 1);

                    if (mapst.get(c1) < maps.get(c1)) {
                        have--;
                    }
                }

                l++;

            }


        }
        return shortlen == Integer.MAX_VALUE ? "" : s.substring(start, start + shortlen);
    }

    public static void main(String[] args) {
        System.out.println(MinimumWindowSubstring.minWindow("ADOBECODEBANC","ABC"));
    }
}
