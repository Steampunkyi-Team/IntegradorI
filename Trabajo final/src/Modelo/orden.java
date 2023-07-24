/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class orden {
    int idOrden;
    int idFormula;
    int nof;
    int cantidad;

    
    double real1;
    double real2;
    double real3;
    double real4;
    double real5;
    public orden() {
    }

    public orden(int idOrden, int idFormula, int nof, int cantidad, double real1, double real2, double real3, double real4, double real5) {
        this.idOrden = idOrden;
        this.idFormula = idFormula;
        this.nof = nof;
        this.cantidad = cantidad;
        this.real1 = real1;
        this.real2 = real2;
        this.real3 = real3;
        this.real4 = real4;
        this.real5 = real5;
    }
    

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public int getNof() {
        return nof;
    }

    public void setNof(int nof) {
        this.nof = nof;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

    public double getReal3() {
        return real3;
    }

    public void setReal3(double real3) {
        this.real3 = real3;
    }

    public double getReal4() {
        return real4;
    }

    public void setReal4(double real4) {
        this.real4 = real4;
    }

    public double getReal5() {
        return real5;
    }

    public void setReal5(double real5) {
        this.real5 = real5;
    }
    
}
