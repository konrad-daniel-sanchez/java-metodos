import java.util.HashMap;

public class SumaTraducida {
    
    static String traducirAEspanol(int numero){
        // Números en español
        String[] numerosEspanol = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        return numerosEspanol[numero];
    }

    static String traducirAIngles(int numero){
        // Definir un diccionario (HashMap) con las traducciones
        HashMap<String, String> numerosTraducidos = new HashMap<>();
        numerosTraducidos.put("cero", "zero");
        numerosTraducidos.put("uno", "one");
        numerosTraducidos.put("dos", "two");
        numerosTraducidos.put("tres", "three");
        numerosTraducidos.put("cuatro", "four");
        numerosTraducidos.put("cinco", "five");
        numerosTraducidos.put("seis", "six");
        numerosTraducidos.put("siete", "seven");
        numerosTraducidos.put("ocho", "eight");
        numerosTraducidos.put("nueve", "nine");
        numerosTraducidos.put("diez", "ten");
        String numeroEspanol = traducirAEspanol(numero);
        return numerosTraducidos.get(numeroEspanol);
    }

    static void imprimirSumaEspanol(int numero1, int numero2, int suma){
        String numero1Str = traducirAEspanol(numero1);
        String numero2Str = traducirAEspanol(numero2);
        String sumaStr = traducirAEspanol(suma);
        System.out.println("La suma de " + numero1Str + " más " + numero2Str + " es igual a " + sumaStr);
    }

    static void imprimirSumaIngles(int numero1, int numero2, int suma){
        String numero1Str = traducirAIngles(numero1);
        String numero2Str = traducirAIngles(numero2);
        String sumaStr = traducirAIngles(suma);
        System.out.println("The sum of " + numero1Str + " plus " + numero2Str + " is equal to " + sumaStr);
    }

    static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 5;

        int suma = sumar(numero1, numero2);
        imprimirSumaEspanol(numero1, numero2, suma);
        imprimirSumaIngles(numero1, numero2, suma);
    }
}
