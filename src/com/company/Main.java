package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userComand = scanner.nextLine();

        ConvertToComand convert = new ConvertToComand();
        convert.setUserComand(userComand);

    }
}
