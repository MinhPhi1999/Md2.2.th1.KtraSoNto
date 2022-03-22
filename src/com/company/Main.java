package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số vào đây: ");
        int number = scanner.nextInt();

        if (number<2){
            System.out.println("kp số nto");
        }else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number + "là số nto");
            }else {
                System.out.println(number + "kp là số nguyên tố");
            }
        }
    }
}
