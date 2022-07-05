package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        if (s.contains(" + ")) {
            return runPlus(s);
        } else if (s.contains(" - ")) {
            return runMinus(s);
        } else if (s.contains(" * ")) {
            return runMulitply(s);
        }
        return runDivide(s);
    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    private static int runMulitply(String s) {
        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    private static int runDivide(String s) {
        String[] sBits = s.split(" \\/ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }
}
