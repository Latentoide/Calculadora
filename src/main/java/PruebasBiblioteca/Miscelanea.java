package PruebasBiblioteca;

public class Miscelanea {

    /**
     * Suma dos números.
     * @param num1 Primer operando
     * @param num2 Segundo operando
     * @return La suma de ambos operandos
     */
    public static int suma(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }

    /**
     * Genera un número entero aleatorio comprendido entre dos números.
     * @param num1 Límite inferior
     * @param num2 Límite superior
     * @return Número entero aleatorio comprendido entre los dos límites
     */
    public static int generaAleatorioEntre(int num1, int num2)
    {
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }

    /**
     * Concatena dos cadenas.
     * @param cad1 Primera cadena
     * @param cad2 Segunda cadena
     * @return La concatenación de ambas cadenas
     */
    public static String concatena (String cad1, String cad2)
    {
        String res = cad1 +" "+ cad2;
        return res;
    }

    /**
     * Dado dos números enteros, calcula cuál es el mayor.
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return El valor del número mayor
     */
    public static int getMayor(int num1, int num2)
    {
        if (num1>num2)
            return num2;
        else
            return num1;
    }

    /**
     * Dado un vector de números enteros, localiza el valor más alto.
     * @param vector Vector donde buscar
     * @return El valor del número más alto
     */
    public static int getMaximo(int vector[])
    {
        int res = vector[0];
        for(int i=0;i<vector.length;i++)
        {
            if(vector[i]>res)
                res = vector[i];
        }
        return res;
    }

    /**
     * Dado un vector de números enteros, devuelve el valor de la posición especificada.
     * @param vector Vector donde se encuentran los números enteros
     * @param pos Posición del elemento
     * @return El elemento que ocupa la posición dada
     */
    public static int getElemento(int vector[], int pos)
    {
        int res = vector[pos-1];
        return res;
    }

    /**
     * Calcula el factorial de un número.
     * @param num Operando
     * @return El factorial del operando dado
     */
    public static int factorial(int num)
    {
        int res=num;
        for(int cont=(num-1);cont>0;cont--){
            res=res*cont;
        }
        return res;
    }

    /**
     * Indica si un número es primo.
     * @param numero Número a analizar
     * @return true si es primo, false si no lo es
     */
    public static boolean esPrimo (int numero){

        if (numero<=1){
            return false;
        }
        int cont=0;
        for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
            if (numero%divisor==0){
                cont+=1;
            }
        }
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Calcula el área de un círculo.
     * @param radio Radio del círculo
     * @return El área del círculo con el radio indicado
     */
    public static double areaCirculo(int radio)
    {
        return Math.pow(radio, 2)*Math.PI;
    }

    /**
     * Calcula el área de un triángulo.
     * @param base Base del triángulo
     * @param altura Altura del triángulo
     * @return El área del triángulo con las características dadas
     */
    public static double areaTriangulo(int base, int altura)
    {
        return base*altura/3;
    }

    /**
     * Calcula el área de un cuadrado.
     * @param lado Lado del cuadrado
     * @return El área del cuadrado de lado indicado
     */
    public static double areaCuadrado(int lado)
    {
        return lado*lado;
    }

    /**
     * Convierte un número entero a binario.
     * @param num Número a convertir
     * @return Cadena de texto con su valor en binario
     */
    public static String decimalABinario(int num)
    {
        String res="";
        String bit;
        for(int i=num;i>0;i/=2){
            if(i%2==1){
                bit="0";
            }else{
                bit="1";
            }
            res=bit+res;
        }
        return res;
    }

}
