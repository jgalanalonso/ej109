package ej109;

public class CNodo {

    private int nAlumno;
    private int nSorteado;
    private CNodo siguiente;
    
    public CNodo() {
        
        this.nAlumno = 0;
        this.nSorteado = 0;
        this.siguiente = null;
    }
    
    public CNodo(int alumno, int numero, CNodo siguiente) {
        
        this.nAlumno = alumno;
        this.nSorteado = numero;
        this.siguiente = siguiente;
    }
    
    public int getnAlumno() {
        return nAlumno;
    }

    public void setnAlumno(int nAlumno) {
        this.nAlumno = nAlumno;
    }

    public int getnSorteado() {
        return nSorteado;
    }

    public void setnSorteado(int nSorteado) {
        this.nSorteado = nSorteado;
    }

    public CNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CNodo siguiente) {
        this.siguiente = siguiente;
    }
}
