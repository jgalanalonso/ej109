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
    
    public int tamaño() {
        
        int contador = 0;
        
        CNodo actual = primero;
        
        while(actual != null)
        {
            actual = actual.getSiguiente();
            contador++;
        }
        
        return contador;
    }
    
    public CNodo Obtener(int elemento) {
        
        int contador = 0;
        CNodo actual = primero;
        
        if(this.primero == null || elemento < 0 || elemento > this.tamaño() - 1)
        {
            return null;
        }
        
        while(actual != null)
        {            
            if (elemento == contador) {
                
                return actual;
            }
            
            actual = actual.getSiguiente();
            contador++;            
        }
        
        return null;
    }
    
    public void AñadirOrd(int nAlumno, int nSorteado) {
        
        CNodo nuevo = new CNodo(nAlumno,nSorteado,null);
    }
}

