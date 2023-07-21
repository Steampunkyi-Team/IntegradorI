/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class formulacion {
    int idFormula;
    String producto;
    int codigo;
    String insumo1;
    String insumo2;
    String insumo3;
    String insumo4;
    String insumo5;
    double cantidad1;
    double cantidad2;
    double cantidad3;
    double cantidad4;
    double cantidad5;

    public formulacion() {
    }

    public formulacion(int idFormula, String producto, int codigo, String insumo1, String insumo2, String insumo3, String insumo4, String insumo5, double cantidad1, double cantidad2, double cantidad3, double cantidad4, double cantidad5) {
        this.idFormula = idFormula;
        this.producto = producto;
        this.codigo = codigo;
        this.insumo1 = insumo1;
        this.insumo2 = insumo2;
        this.insumo3 = insumo3;
        this.insumo4 = insumo4;
        this.insumo5 = insumo5;
        this.cantidad1 = cantidad1;
        this.cantidad2 = cantidad2;
        this.cantidad3 = cantidad3;
        this.cantidad4 = cantidad4;
        this.cantidad5 = cantidad5;
    }

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInsumo1() {
        return insumo1;
    }

    public void setInsumo1(String insumo1) {
        this.insumo1 = insumo1;
    }

    public String getInsumo2() {
        return insumo2;
    }

    public void setInsumo2(String insumo2) {
        this.insumo2 = insumo2;
    }

    public String getInsumo3() {
        return insumo3;
    }

    public void setInsumo3(String insumo3) {
        this.insumo3 = insumo3;
    }

    public String getInsumo4() {
        return insumo4;
    }

    public void setInsumo4(String insumo4) {
        this.insumo4 = insumo4;
    }

    public String getInsumo5() {
        return insumo5;
    }

    public void setInsumo5(String insumo5) {
        this.insumo5 = insumo5;
    }

    public double getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(double cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public double getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(double cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public double getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(double cantidad3) {
        this.cantidad3 = cantidad3;
    }

    public double getCantidad4() {
        return cantidad4;
    }

    public void setCantidad4(double cantidad4) {
        this.cantidad4 = cantidad4;
    }

    public double getCantidad5() {
        return cantidad5;
    }

    public void setCantidad5(double cantidad5) {
        this.cantidad5 = cantidad5;
    }
    
    
}
