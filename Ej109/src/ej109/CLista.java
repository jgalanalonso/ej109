package ej109;

public class CLista {

    private CNodo primero;
    
    public CLista() {
        
        this.primero = null;
    }
    
    public void Añadir(int nAlumno, int nSorteado) {
        
        CNodo nuevo = new CNodo(nAlumno,nSorteado, null);        
        
        if (primero == null) 
        {
            primero = nuevo;
        }
        else
        {
            CNodo recorrido = primero;

            while(recorrido.getSiguiente() != null) {
               
                recorrido = recorrido.getSiguiente();
            
            }
            
            recorrido.setSiguiente(nuevo);
        }
    } 
}

