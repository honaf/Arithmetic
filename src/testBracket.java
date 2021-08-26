

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class testBracket {

    public static void main(String[] args) {
        boolean r = isValid("{}");
        System.out.print(r);
    }
    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')'); put('?','?');
    }};
    public static boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        map.put('?', '?');
        if (!map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        stack.add('?');
        for (Character c: s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.addLast(c);
            } else if (map.get(stack.removeLast()) != c) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}
