package project.assignment1;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";
        int result = romanToInteger(roman);
        System.out.println(result);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int num = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                num -= currentValue;
            } else {
                num += currentValue;
            }
            prevValue = currentValue;
        }
        return num;
    }
}

