package app.gralak;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

import static app.gralak.VigenereLogic.decrypt;
import static app.gralak.VigenereLogic.encrypt;

public class Main {

    public static void main(String[] args) {
        new AppFrame();
//        Scanner optionInput = new Scanner(System.in);
//        Scanner fileInput = new Scanner(System.in);
//        Scanner keyInput = new Scanner(System.in);
//
//        System.out.println("- Press 1 to e a message / Press 2 to d a message - ");
//        int input = optionInput.nextInt();
//
//        System.out.println("- Enter filename:  ");
//        String filename = fileInput.nextLine();
//
//        System.out.println("- Enter key:  ");
//        String key = keyInput.nextLine();
//
//        switch (input) {
//            case 1: {
//                String outputData = encrypt(filename, key);
//                System.out.print(outputData);
//                break;
//            }
//            case 2: {
//                String outputData = decrypt(filename, key);
//                System.out.print(outputData);
//                break;
//            }
//            default: {
//                throw new Error("there is no defailt option");
//            }
//        }
    }
}
