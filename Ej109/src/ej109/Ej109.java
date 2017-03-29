package ej109;

public class Ej109 {

    public static void main(String[] args) {
        
        int nSorteados[];
        
        int NumRepartir = 30 + (int)(Math.random() * 100);        
        nSorteados = new int[NumRepartir];
        CLista sorteo = new CLista();
   
        for (int i = 0; i < NumRepartir; i++)
        {            
            int nAlumno = 1 + (int)(Math.random() * 30);
            int nSorteado = 0;
            
            // Generación numero de sorteo sin repetir
            
            do {
                
                nSorteado = 1 + (int)(Math.random() * NumRepartir);
            }
            while(numeroRepetido(nSorteados, nSorteado));
            
            nSorteados[i] = nSorteado;
            
            // Fin generacion numero de sorteo sin repetir
            
            sorteo.Añadir(nAlumno, nSorteado);
        }
        
    }
    
    public static boolean numeroRepetido(int[] numeros, int n) {
        
        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] == n)
            {
                return true;
            }
        }
        
        return false;
    }
}
