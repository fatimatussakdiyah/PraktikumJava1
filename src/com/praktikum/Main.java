package com.praktikum;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namaDepan = "Fatimatus";
        String namaBelakang = "Sakdiyah";

        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 4.00;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.print("Input Nama Depan : ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Nama Belakang : ");
        namaBelakang = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input Target Kuliah : ");
        targetTahunKuliah = scanner.nextInt();
        System.out.print("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.print("");
        System.out.print("Input Nilai Abjad : ");
        nilaiAbjad = scanner.next().charAt(0);
        System.out.print("Cantik? : ");
        cantik = scanner.nextBoolean();

        System.out.println("=============OUTPUT============");
        System.out.println("Nama Depan : " + namaDepan );
        System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO : " +nilaiAbjad);
        System.err.println("Cantik : " + cantik);

        JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaBelakang);

    }
}
