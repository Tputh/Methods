import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    // Задача 1
    public static void leapYear(int issueCount) {
        System.out.println(issueCount + " год - является високосным");
    }

    public static void notAleapYear(int issueCount) {
        System.out.println(issueCount + " год - не является високосным");
    }


    // Задача 2
    public static void yearOfManufactureAndroid(int issueCount) {
        System.out.println(issueCount + " год. Установите облегченную версию приложения для Android по ссылке!!!");
    }

    public static void yearOfManufactureIos(int issueCount) {
        System.out.println(issueCount + " год. Установите облегченную версию приложения для IOS по ссылке!!!");
    }

    // Задача 3
    public static void daysForDelivery(int issueCount) {
        System.out.println("Потребуется дней " + issueCount);
    }


    public static void main(String[] args) {
        System.out.println("Дз. Методы");

        task1();
        task2();
        task3();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] year = {2021};
        for (int i = 0; i < year.length; i++) {
            if ((i + 1) % 4 == 0) {

                leapYear(year[i]);
            } else {
                notAleapYear(year[i]);
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] android = {2012, 2013, 2015, 2016,};
        int[] ios = {2014, 2015, 2016,};
        yearOfManufactureAndroid(android[1]);
        yearOfManufactureIos(ios[0]);
    }

    public static void task3() {


        System.out.println("Задача 3");

        int deliveryDistance = 95;
        int deliveryWithin20Km = 1;
        int deliveryWithin20KmTo60Km = deliveryWithin20Km + 1;
        int deliveryWithin60KmTo100Km = deliveryWithin20KmTo60Km + 1;
        boolean numberOfDays = ((deliveryWithin20Km <= 95) && (deliveryWithin20KmTo60Km <= 95) || (deliveryWithin60KmTo100Km <= 95));
        daysForDelivery(deliveryWithin60KmTo100Km);

    }
}








