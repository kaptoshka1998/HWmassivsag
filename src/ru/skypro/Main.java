package ru.skypro;

public class Main {

    public static void year (int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void yearIA(int IA, int year) {
        if (IA == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (IA == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                if (IA == 1 && year >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }

    public static void distance(int dist) {
        if (dist <= 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            if (dist > 20 && dist <= 60 ) {
                System.out.println("Потребуется дней: 2");
            } else {
                if (dist > 60 && dist <= 100 ) {
                    System.out.println("Потребуется дней: 3");
                }
            }
        }
    }

    public static void massiv(String str) {
        String res = "";
        char[] massy = str.toCharArray();
        res = res + massy[0];
        for (int i = 1; i < massy.length; i++) {
            if (massy[i] == massy[i - 1]) {
                System.out.println("Дубликат " + massy[i]);
                break;
            } else {
                res = res + massy[i];
            }
            if (i == massy.length-1) {
                System.out.println(res);
            }
        }
    }

    public static void reverseName(char[] revName) {
        for (int i = revName.length-1; i >= 0; i--) {
            System.out.print(revName[i]);

        }

        }

    public static void main(String[] args) {

        //Задание 1
        int currentYear = 2021;
        year(currentYear);

        //Задание 2
        int year = 2021;
        int IA = 1;
        yearIA(year, IA);

        //Задание 3
        int distance = 65;
        distance(distance);

        //Задание 4
        String lesson = "abcdefghijk";
        massiv(lesson);

        //Задание 5
        char[] revName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseName(revName);


    }
}
