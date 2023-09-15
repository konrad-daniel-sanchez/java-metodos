public class LlamadosRecursivos {
    static void impresionIterativa(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }

    static void impresionRecursiva(int i){
        if(i<10) {
            System.out.println(i);
            impresionRecursiva(i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Imperativa:");
        impresionIterativa();
        System.out.println("Recursiva:");
        impresionRecursiva(0);
    }
}
