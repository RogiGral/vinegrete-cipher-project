package app.gralak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class VigenereLogic {

    public static String encrypt(String inputData, String key) {
        inputData = inputData.toUpperCase(Locale.ROOT);
        String outputData = "";
        for (int i = 0, j = 0; i < inputData.length(); i++) {
            char letter = inputData.charAt(i);
            if (letter == ' ' || letter == '\t' || letter == '\n' || letter == '\r') {
                outputData += letter;
                j = ++j % key.length();
                continue;
            }
            outputData += (char)(((letter - 65) + (key.charAt(j)-65)) % 26 + 65);
            j = ++j % key.length();
        }
        return outputData;
    }


    public static String decrypt(String inputData, String key) {
        inputData = inputData.toUpperCase(Locale.ROOT);
        String outputData = "";
        for (int i = 0, j = 0; i < inputData.length(); i++) {
            char letter = inputData.charAt(i);
            if (letter == ' ' || letter == '\t' || letter == '\n' || letter == '\r') {
                outputData += letter;
                j = ++j % key.length();
                continue;
            }
            outputData += (char)((letter - key.charAt(j) + 26) % 26 + 65);
            j = ++j % key.length();
        }
        return outputData;
    }
}
