/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_asis_3;

import java.util.Scanner;

/**
 *
 * @author Ahnaf
 */
public class TesLinearEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input\t: ");
        Scanner Angka = new Scanner(System.in);
        double X1 = Angka.nextDouble();
        double Y1 = Angka.nextDouble();
        double X2 = Angka.nextDouble();
        double Y2 = Angka.nextDouble();
        double Z1 = Angka.nextDouble();
        double Z2 = Angka.nextDouble();

        LinearEquation LE1 = new LinearEquation();
        LE1.Output();
        LE1.getPersamaanLinear(X1, Y1, Z1);
        LE1.getPersamaanLinear(X2, Y2, Z2);
        LE1.setA(X1);
        LE1.setB(Y1);
        LE1.setC(X2);
        LE1.setD(Y2);
        LE1.setE(Z1);
        LE1.setF(Z2);
        LE1.Hasilnya();
        LE1.cekSolusi();
    }

}
