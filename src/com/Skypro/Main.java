package com.Skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkLeapYear(2022);
        checkDeviceTypeAndYear(1, 2019);

        int day = calculateDeliveryTime(80);
        if (day == 1) {
            System.out.println("Доставка " + day + " день");
        } else if (day == 2) {
            System.out.println("Доставка " + day + " дня");
        } else if (day == 3) {
            System.out.println("Доставка " + day + " дня");
        } else {
            System.out.println("Доставки нет");
        }
    }


    public static void checkLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDeviceTypeAndYear(int clientOs, int clientDeviceYear) {
        System.out.println("\nЗадача_2");
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        System.out.println("\nЗадача_5");
        int day;
        if (deliveryDistance <= 20) {
            day = 1;
        } else if (deliveryDistance <= 60) {
            day = 2;
        } else if (deliveryDistance <= 100) {
            day = 3;
        } else {
            day = 4;
        }
        return day;
    }
}


