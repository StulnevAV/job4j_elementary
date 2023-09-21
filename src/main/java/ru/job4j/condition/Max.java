package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, three, four));
    }

    public static void main(String[] args) {
        int maxNumber = Max.max(1, 2);
        System.out.println(maxNumber);
        int maxNumber2 = Max.max(3, 4, 6);
        System.out.println(maxNumber2);
        int maxNumber3 = Max.max(3, 4, 6, 8);
        System.out.println(maxNumber3);
    }
}
