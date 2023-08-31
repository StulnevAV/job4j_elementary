package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int maxNumber = Max.max(1, 2);
        System.out.println(maxNumber);
        int maxNumber2 = Max.max(3, 2);
        System.out.println(maxNumber2);
        int maxNumber3 = Max.max(3, 3);
        System.out.println(maxNumber3);
    }
}
