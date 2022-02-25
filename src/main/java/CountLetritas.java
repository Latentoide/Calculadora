import java.util.Locale;

public class CountLetritas {
    public static void main(String[] args) {
        System.out.println(contarLetritas("Buenas tardes como estan usted", "REBNAToCM "));
    }
    public static int contarLetritas(String f1, String f2){
        f1 = f1.toLowerCase(Locale.ROOT);
        f2 = f2.toLowerCase(Locale.ROOT);
        if(f1.length() == 0 && f2.length() == 0){
            return 0;
        }else if(f1.length() == 0){
            return -1;
        }else if(f2.length() == 0){
            return 1;
        }
        String aux1 = f1;
        String aux2 = f2;
        for (int i = 0; i < f1.length(); i++) { // Coste: n a la 3
            for (int j = 0; j < f2.length(); j++) {
                if(f1.charAt(i) == f2.charAt(j)){
                    aux1 = quitarLaLetra(aux1, f1.charAt(i));
                    aux2 = quitarLaLetra(aux2, f1.charAt(i));
                }
            }
        }
        if(aux1.length() > aux2.length()){
            return 1;
        }else if(aux2.length()> aux1.length()){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static String quitarLaLetra(String f, char c){
        String out = "";
        for (int i = 0; i < f.length(); i++) {
            if(f.charAt(i) != c){
                out += f.charAt(i);
            }
        }
        return out;
    }
}
