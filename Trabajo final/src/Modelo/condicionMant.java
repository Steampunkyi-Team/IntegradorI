package Modelo;

public class condicionMant {
    int idCondicionMant;
    double TolvaRPM;
    double TornilloRPM;
    double Presion;
    double Amperaje;
    double Vacio;
    double Rendimiento;

    public condicionMant() {
    }

    public condicionMant(int idCondicionMant, double TolvaRPM, double TornilloRPM, double Presion, double Amperaje, double Vacio, double Rendimiento) {
        this.idCondicionMant = idCondicionMant;
        this.TolvaRPM = TolvaRPM;
        this.TornilloRPM = TornilloRPM;
        this.Presion = Presion;
        this.Amperaje = Amperaje;
        this.Vacio = Vacio;
        this.Rendimiento = Rendimiento;
    }

    public int getIdCondicionMant() {
        return idCondicionMant;
    }

    public void setIdCondicionMant(int idCondicionMant) {
        this.idCondicionMant = idCondicionMant;
    }

    public double getTolvaRPM() {
        return TolvaRPM;
    }

    public void setTolvaRPM(double TolvaRPM) {
        this.TolvaRPM = TolvaRPM;
    }

    public double getTornilloRPM() {
        return TornilloRPM;
    }

    public void setTornilloRPM(double TornilloRPM) {
        this.TornilloRPM = TornilloRPM;
    }

    public double getPresion() {
        return Presion;
    }

    public void setPresion(double Presion) {
        this.Presion = Presion;
    }

    public double getAmperaje() {
        return Amperaje;
    }

    public void setAmperaje(double Amperaje) {
        this.Amperaje = Amperaje;
    }

    public double getVacio() {
        return Vacio;
    }

    public void setVacio(double Vacio) {
        this.Vacio = Vacio;
    }

    public double getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(double Rendimiento) {
        this.Rendimiento = Rendimiento;
    }
    
    


       
    
}
