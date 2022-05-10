package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ведіть число з проміжку (25 - 100)");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 100) System.out.println("Число " + number + " не міститься в проміжку(25 - 100)");
        else if (number < 25) System.out.println("Число " + number + " не міститься в проміжку(25 - 100)");
        else {
            System.out.println("Число " + number + " міститься в проміжку (25 - 100)");
        }
        //zavdanja 2

        System.out.println("Ведіть  трьохзначне число: ");
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();
        int m_1 = a / 100;
        int m_2 = a % 100 / 10;
        int m_3 = a % 10;
        int m_1_2 = Math.max(m_1, m_2);
        System.out.println(Math.max(m_1_2, m_3));
        //zavdanja 3

        System.out.println("Підніматися чи Опускатися :");
        Scanner scanner_2 = new Scanner(System.in);
        String a_2 = scanner_2.nextLine();

        System.out.println("Виберіть поверх який хочете відвідати :");
        Scanner scanner3 = new Scanner(System.in);
        int g = scanner3.nextInt();


        if (a_2.equals("Підніматися")) {
            if (g > 9 || g < 1) {
                System.out.println("Ви вказали не існуючий поверх");
            } else if (g == 2) {
                System.out.println("Нажаль на даний момент ліфт не піднімається на 2 поверх");
                System.out.println("Піднімаємося на 3 поверх");

            } else if (g == 1) {
                System.out.println("Не можна підніматися на перший поверх");

            } else System.out.println("Піднімаємося на " + g + " поверх");
        }

        if (a_2.equals("Опускатися")) {
            if (g > 9 || g < 1) {
                System.out.println("Ви вказали не існуючий поверх");
            } else if (g == 2) {
                System.out.println("Нажаль зараз ліфт не опускається на 2 поверх");
                System.out.println("Опускаємося на 1 поверх");
            } else if (g == 9) {
                System.out.println("Не можна опускатися на девятий поверх");
            } else System.out.println("Опускаємося на " + g + " поверх");

        }
        //zavdanja 4

        System.out.println("Ведіть 'Так', 'ОК', 'Yes', 'Y', '+', 'Ok' " + " або 'Ні', 'NO', 'N', '-', 'No' ");
        Scanner scanner4 = new Scanner(System.in);
        String lm = scanner4.nextLine();
        switch (lm) {
            case "Так", "OK", "Yes", "Y", "+", "ok":
                System.out.println("Я погоджуюся!");
                break;
            case "Ні", "NO", "N", "-", "No":
                System.out.println("Я відмовляюся!");
                break;
            default:
                System.out.println("Ви вели не вірне значення");
        }
    }
}
