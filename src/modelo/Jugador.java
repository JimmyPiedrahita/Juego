package modelo;
public class Jugador {
    private int nVictorias;
    private int nEmpates;
    private int nDerrotas;
    private int[] eleccion = {1,2,3};

    public int[] getEleccion() {
        return eleccion;
    }
    public void setEleccion(int[] eleccion) {
        this.eleccion = eleccion;
    }
    public int getnVictorias() {
        return nVictorias;
    }
    public void setnVictorias(int nVictorias) {
        this.nVictorias = nVictorias;
    }
    public int getnEmpates() {
        return nEmpates;
    }
    public void setnEmpates(int nEmpates) {
        this.nEmpates = nEmpates;
    }
    public int getnDerrotas() {
        return nDerrotas;
    }
    public void setnDerrotas(int nDerrotas) {
        this.nDerrotas = nDerrotas;
    }
}