package Modelo;

public class condicionMant {
    int idCondicionMant;
    int TolvaRPM;
    int TornilloRPM;
    int Presion;
    int Amperaje;
    int Vacio;
    int Rendimiento;

    public condicionMant() {
    }

    public condicionMant(int idCondicionMant, int TolvaRPM, int TornilloRPM, int Presion, int Amperaje, int Vacio, int Rendimiento) {
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

    public int getTolvaRPM() {
        return TolvaRPM;
    }

    public void setTolvaRPM(int TolvaRPM) {
        this.TolvaRPM = TolvaRPM;
    }

    public int getTornilloRPM() {
        return TornilloRPM;
    }

    public void setTornilloRPM(int TornilloRPM) {
        this.TornilloRPM = TornilloRPM;
    }

    public int getPresion() {
        return Presion;
    }

    public void setPresion(int Presion) {
        this.Presion = Presion;
    }

    public int getAmperaje() {
        return Amperaje;
    }

    public void setAmperaje(int Amperaje) {
        this.Amperaje = Amperaje;
    }

    public int getVacio() {
        return Vacio;
    }

    public void setVacio(int Vacio) {
        this.Vacio = Vacio;
    }

    public int getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(int Rendimiento) {
        this.Rendimiento = Rendimiento;
    }

       
    
}
