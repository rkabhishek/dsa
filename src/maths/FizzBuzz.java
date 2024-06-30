package maths;

import java.util.*;

// leetcode 412
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Fizz");
        map.put(5, "Buzz");

        for (int i = 1; i <= n; i++) {
            StringBuilder value = new StringBuilder();

            for (Integer k: map.keySet()) {
                if (i % k == 0) {
                    value.append(map.get(k));
                }
            }
            answer.add(value.length() == 0 ? String.valueOf(i) : value.toString());
        }

        return answer;
    }
}
