import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println(esPal("AleelA"));
    }

    /**
     * @param f1 string que va ser puesto a prueba
     * @return true o false dependiendo de lo larga que sea la frase y etc
     */
    public static boolean esPal(String f1){
        String f2 = ""; // 1
        for (int i = f1.length()-1; i >= 0; i--) { //2 inicializar, 3 condicion, 5 cambiar contador
            f2 += f1.charAt(i);                    //4
        }
        f1 = f1.replace(" ", "");//6
        f2 = f2.replace(" ", "");//6
        f1 = quitarSignos(f1);//7
        f2 = quitarSignos(f2);//7

        if(f1.length() > f2.length() || f1.length() < f2.length()) {//18
            return false;                                           //19
        }
        return f1.equals(f2);//20
    }

    /**
     *
     * @param f string al cual se le va a quitar todos los signos de puntuación para dejorlo como una string entera
     * @return devuelve el propio string sin signos de puntuación
     */
    public static String quitarSignos(String f){
        char[] signos = {' ', '.', ',', '_', '(', ')', '!', '¡', '?', '¿'};//8
        String out = "";                                                   //8
        int i = 0;                                                         //9
        while (i < f.length()){                      //10
            for (int k = 0; k < signos.length; k++) {//11 condicion, 14 cambiar contador
                if(f.charAt(i) == signos[k]){        //12
                    i++;                             //13
                    k = 0;                           //13
                }
            }
            out += f.charAt(i);//15
            i++;               //16
        }
        return out; // 17
    }
}
