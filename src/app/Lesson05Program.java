package app;

import java.util.Random;
import java.util.Scanner;

public class Lesson05Program {

    public static void main(String[] args) {

        int number = 45; // 0101101 Значення, яке потрібно зашифрувати - в двійковій формі 101101
        int key = 102; //Ключ шифрування - в двійковій системі 1100110
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(key));
        int encrypt = number ^ key; //Результатом буде число 1001011 або 75
        System.out.println("Зашифроване число: " +encrypt);
        System.out.println(Integer.toBinaryString(encrypt));

        int decrypt = encrypt ^ key; // Результатом будет число 45
        System.out.println("Розшифроване число: " + decrypt);

//        long a = 64;
//        //System.out.println(a << 2);// 2 * 2 в ступені кількості бітовиз зсувів
//        System.out.println(a >> 2);// 2 / 2 в ступені кількості бітовиз зсувів

//        int a = 2; // 010
//        int b = 5; // 101
//        System.out.println(a&b); // result 0
//
//        int a1 = 4; // 100
//        int a2 = 5; // 101
//        System.out.println(a1&a2);// result 4


//        int a = 2; //010
//        int b = 5; // 101
//
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));

//        System.out.println(a|b); // result 7 - 111
//        System.out.println(Integer.toBinaryString(7)); // result 7 - 111
//        System.out.println();
//
//        int a1 = 4; //100
//        int b1 = 5; //101
//
//        System.out.println(Integer.toBinaryString(a1));
//        System.out.println(Integer.toBinaryString(b1));
//
//        System.out.println(a1|b1); // result 5 - 101
//        System.out.println(Integer.toBinaryString(5));

//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter number from 1 - 10");
//        int manualNumber = scanner.nextInt();
//        //String manualNumber = scanner.next();
//        System.out.println(randomNumber + " : " + manualNumber);



        //int result = manualNumber >= randomNumber ? manualNumber : randomNumber;
//        String result = manualNumber > randomNumber ? "Manual Power" : "random won";
//
//        String str = "";
//        if (manualNumber >= randomNumber)
//            str = "Manual Power";
//        else
//            str = "random won";
//
//
//        System.out.println(str);
//
//        System.out.println(result);
//        boolean isValueBigger = manualNumber > randomNumber;
//        if (!isValueBigger){
//            System.out.println("Random won");
//        }else {
//            System.out.println("manual power");
//        }

//        if (manualNumber >= 0 && manualNumber < 10){
//            manualNumber *=10;
//            System.out.println(manualNumber);
//        }else if (manualNumber >= 10 && manualNumber < 100){
//            manualNumber*=100;
//            System.out.println(manualNumber);
//        } else if (manualNumber >= 100 && manualNumber < 1000) {
//            manualNumber *= 1000;
//            System.out.println(manualNumber);
//        }else {
//            System.out.println(manualNumber);
//        }

//        String monday = "monday";
//        String tuesday = "tuesday";
//        String wednesday = "wednesday";
//        String thursday = "thursday";
//        String friday = "friday";
//        String saturday = "saturday";
//        String sunday = "sunday";
//
//        switch (manualNumber){
//            case 1 :
//                System.out.println(monday);
//                break;
//            case 2:
//                System.out.println(tuesday);
//                break;
//            case 3:
//                System.out.println(wednesday);
//                break;
//            case 4:
//                System.out.println(thursday);
//                break;
//            case 5:
//                System.out.println(friday);
//                break;
//            case 6:
//                System.out.println(saturday);
//                break;
//            case 7:
//                System.out.println(sunday);
//                break;
//            default:
//                System.out.println("invalid number");
//        }

//        if (manualNumber >= 10 || manualNumber <0){
//            System.out.println("invalid number");
//            return;
//        }

//        if (manualNumber >= 0 && manualNumber < 10) {
//            if (randomNumber > manualNumber) {
//                System.out.println(randomNumber);
//            } else if (randomNumber == manualNumber) {
//                System.out.println(randomNumber);
//                System.out.println(manualNumber);
//            } else {
//                System.out.println(manualNumber);
//            }
//        } else {
//            System.out.println("invalid number");
//        }

//        if (randomNumber > manualNumber){
//            System.out.println(randomNumber);
//        } else if (randomNumber == manualNumber) {
//            System.out.println(randomNumber);
//            System.out.println(manualNumber);
//        } else {
//            System.out.println(manualNumber);
//        }

//        Random rnd = new Random();
//        int randomNum1 = rnd.nextInt(5) ;
//        int randomNum2 = rnd.nextInt(5) ;
//        System.out.println(randomNum1 + " : " + randomNum2);
//
//        boolean result = randomNum1 == randomNum2;
//        System.out.println(result);
    }

}
