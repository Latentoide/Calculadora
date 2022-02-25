import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        String frase1="hoollass";
        String frase2="aaadddiooosss";
        String clear1="";
        String clear2="";

        clear1=LimpiarFrase(frase1);
        clear2=LimpiarFrase(frase2);
        CompararFrase(clear1,clear2);
        System.out.println(CompararFrase(clear1,clear2));

    }

    private static int CompararFrase(String frase1, String frase2) {
        int cont1=0,cont2=0;
        for (int i=0;i<frase1.length();i++){
            cont1++;
        }
        for (int i=0;i<frase2.length();i++){
            cont2++;
        }

        if (cont1>cont2)
            return 1;
        else if (cont2>cont1)
            return -1;
        else
            return 0;

    }

    public static String LimpiarFrase(String frase){
        String clear="";
        frase+=" ";
        // recorremos toda la frase
        for (int i=0;i<frase.length();i++){
            // añadimos un filtro para que no pueda salir
            // del limite de palabras de la frase
            if (i<frase.length()-1){
                // si una palabra NO es igual a la que le sigue
                // se guarda en una String
                if (frase.charAt(i)!=frase.charAt(i+1)){
                    clear+=frase.charAt(i);
                }
            }
       }
        return clear;
    }
}
