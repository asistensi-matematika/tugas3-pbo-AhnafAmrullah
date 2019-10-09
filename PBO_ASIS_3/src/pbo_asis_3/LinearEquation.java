/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_asis_3;

/**
 *
 * @author Ahnaf
 */
public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void Output() {
        System.out.println("\nOutput\t:");
        System.out.println("Sistem Persamaannya:");
    }

    public void getPersamaanLinear(double x, double y, double z) {
        if (x < 0) {
            System.out.println("- " + x * (-1) + "x" + " + " + y + "y = " + z);
        } else if (y < 0) {
            System.out.println(x + "x" + " - " + y * (-1) + "y = " + z);
        } else if (x < 0 || y < 0) {
            System.out.println("- " + x * (-1) + "x" + " - " + y * (-1) + "y = " + z);
        } else {
            System.out.println(x + "x" + " + " + y + "y = " + z);
        }
    }

    public void Hasilnya() {
        System.out.println("\nHasilnya:");
    }

    public String NilaiX() {
        double x = (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
        String X = String.format("%.2f", x);
        return X;
    }

    public String NilaiY() {
        double y = (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
        String Y = String.format("%.2f", y);
        return Y;
    }

    public void cekSolusi() {
        if ((getA() * getD() - getB() * getC()) == 0) {
            System.out.println("Sistem tidak memiliki penyelesaian.");
        } else {
            System.out.println("x = " + NilaiX() + " , " + "y = " + NilaiY());
        }
    }
}
