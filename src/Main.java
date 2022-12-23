import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {


    // Задача 1
    public static void year(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - является високосным");
        } else {
            System.out.println(year + " год - не является високосным");
        }
    }
    // Задача 2

    public static void mobile(int os, int year) {
        int stop = 2015;
        if (os < 0 || os > 1) {
            System.out.println("НЕИЗВЕСТНОЕ УСТРОЙСТВО!!!");
        }

        if (os == 0) {
            if (year > stop) {
                System.out.println("Устройство Ios Установите текущую версию");
            } else {
                System.out.println("Устройство Ios Установите предыдущую версию");
            }
        }
        if (os == 1) {
            if (year > stop) {
                System.out.println("Устройство Android Установите текущую версию");
            } else {
                System.out.println("Устройство Android Установите предыдущую версию");
            }
        }
    }
    public static int deliveryDays(int distance){
        int deliveryDays = 0;
        if (distance <= 20){
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется " + deliveryDays + " дня для доставки");
        } else if (distance > 100){
            System.out.println("Доставки не будет");
        }
        return deliveryDays;
    }


    public static void main(String[] args) {
        System.out.println("Исправления. Дз. Методы");
        task1();
        task2();
        task3();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] year = {2020, 2022, 2024};
        for (int i = 0; i < year.length; i++) {
            year(year[i]);
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        mobile(0, 2016);
        mobile(1, 1);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int distance = 101;
        deliveryDays(distance);

    }
}











