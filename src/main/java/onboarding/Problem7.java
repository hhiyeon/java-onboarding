package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    private static void addFriendToMap(Map<String, List<String>> friendsMap, String userA, String userB) {
        friendsMap.compute(userB, (k, v) -> v == null ? new ArrayList<>() : v).add(userA);
    }

    private static boolean isSameName(String friendName, String userName) {
        return friendName.equals(userName);
    }

    private static boolean isAlreadyFriend(List<String> userFriends, String friendName) {
        return userFriends.contains(friendName);
    }

    private static void addFriendToList(List<String> userFriends, String friendName) {
        userFriends.add(friendName);
    }
}
