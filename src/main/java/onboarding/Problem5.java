package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

    private static int getNumberOfChange(int remainMoney, int moneyType) {
        return remainMoney / moneyType;
    }

    private static void addNumberOfChange(List<Integer> changeResult, int remainMoney, int moneyType) {
        changeResult.add(getNumberOfChange(remainMoney, moneyType));
    }
}
