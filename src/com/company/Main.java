package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        task5();

    }
    static void Task1(){
        int intVar1 = 5;
        int intVar2 = 10;

        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);
        System.out.println(shortSum++);

        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println(byteSum);
        System.out.println(++byteSum);
    }
    static void Task2(){
        // Task2
    float value = 1.6f;
    double value_double = value;
    double down = Math.floor(value_double);
    int rounded = Math.round(value);
    double up = Math.ceil(value);
        System.out.println("Down to closest integral: " + down);
        System.out.println("Rounded value: " + rounded);
        System.out.println("Up to closest integral: " + up);

    }
    static void Task3(){
    //Task3
        double value = 45;
        double sin = Math.sin(value);
        double tan = Math.tan(value);
        double cos = Math.cos(value);
        double asin = Math.asin(value);
        double acos = Math.acos(value);

        System.out.println("Sin: " + sin);
        System.out.println("Tan: " + tan);
        System.out.println("Cos: " + cos);
        System.out.println("Asin: " + asin);
        System.out.println("Acos: " + acos);

    }
    static void Task4(){
    //Increment and decrement operators
        int value = 5;
        System.out.println("Increment: " + ++value);
        int value1 = 8;
        System.out.println("Decrement: " + --value1);
     //Bitwise Complement
        int value2 = 55;
        System.out.println("Bitwise: " + ~value2);
     // Arithmetic operator
        int v3 = 13; int v4 = 4;
        System.out.println("v3 + v4 = " + (v3+v4));
        System.out.println("v3 * v4 = " + (v3*v4));
     // Relational Operator
        int v5 = 10; int v6 = 11;
        System.out.println("Are values equal? " + (v5 == v6)); //should be false
        System.out.println("Are values not equal? " + (v5 != v6)); //should be true
     // Conditional Operator
        System.out.println(20 > 5 && 15 >= 15);
        System.out.println(20 < 5 || 15 > 16);
    }

    static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the distance in meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Please input how many hours taken: ");
        double hours_taken = scanner.nextDouble();

        System.out.println("Please input how many minutes taken: ");
        double minutes_taken = scanner.nextDouble();

        System.out.println("Please input seconds: ");
        double seconds_taken = scanner.nextDouble();

        //1hr = 3600 seconds. 1min = 60 seconds
        double seconds = (hours_taken * 3600) + (minutes_taken * 60) + seconds_taken;
        double meters_per_second = meters / seconds;
        System.out.println("Meters per second: " + meters_per_second);

        double hours = (seconds_taken / 3600) + (minutes_taken / 60) + hours_taken;

        double kilometrs = meters / 1000;
        double miles = meters / 1609;
        double km_per_hour = kilometrs / hours;
        double miles_per_hour = miles / hours;
        System.out.println("KM per hours: " + km_per_hour);
        System.out.println("Miles per hours: " + miles_per_hour);

        if (meters > 2000) {
            System.out.println("Meters covered is greater than 2000");

        } else {
            System.out.println("Meters covered is less than 2000");
        }

    }

}
