import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return Math.min(
            map.getOrDefault('b', 0),
            Math.min(
                map.getOrDefault('a', 0),
                Math.min(
                    map.getOrDefault('l', 0) / 2,
                    Math.min(map.getOrDefault('o', 0) / 2, map.getOrDefault('n', 0))
                )
            )
        );
    }
}