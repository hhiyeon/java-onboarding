package onboarding;

import java.util.Deque;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }

    private static boolean isValidStringLength(String str) {
        return str.length() == 1;
    }

    private static char[] getStringToChar(String str) {
        return str.toCharArray();
    }

    private static boolean isEmptyDeque(Deque<Character> deque, int DequeIndex) {
        return DequeIndex == 0 || deque.isEmpty();
    }

    private static void addElementToDeque(Deque<Character> deque, char element) {
        deque.add(element);
    }

    private static void removeDuplicate(Deque<Character> deque) {
        deque.removeLast();
    }

    private static char initLastRemove() {
        return ' ';
    }

    private static char initLastRemove(char lastElement) {
        return lastElement;
    }
}
