package ru.netology;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 150)) {
            System.out.println("Случайное число: " + r);
            if (r == 150) {
                System.out.println("Выпало число 150, давайте на этом закончим");
                break;
            }
        }
    }
}
