package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasyk varda: ");
        String vardas = sc.nextLine();
        int ilgis = vardas.length();

        System.out.println("Vardas: " + vardas);
        System.out.println("Vardo ilgis: " + ilgis);
    }
}
