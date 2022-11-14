import java.time.*;
import java.util.*;

public class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String answer = dayOfWeek.toString();
        return answer.substring(0, 3);
    }
}