public class MetodosSimples {
    static int f(int x){
        return x - 4;
    }

    static int g(int y){
        return 2 * y;
    }

    public static void main(String[] args) {
        System.out.println(f(8));
        System.out.println(g(5));

        int z = f(g(3));
        System.out.println(z);
    }
}
