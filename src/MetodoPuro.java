public class MetodoPuro {
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int valor_esperado1 = 8;
        int n1 = 3;
        int n2 = 5;

        int resultado = sumar(n1, n2);

        if (resultado == valor_esperado1) {
            System.out.println("Mi método funciona correctamente");
        } else {
            System.out.println("HAY ALGO INCORRECTO !!!!");
        }
    }
}
