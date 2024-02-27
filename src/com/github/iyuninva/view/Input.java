package com.github.iyuninva.view;

import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    public static String inputText() {
        String text = scanner.nextLine();
        return text;
    }

    public static int inputInt() {
        int number = Integer.parseInt(inputText());
        return number;
    }

}
