public class puntoC {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        int i = numeroInicio;
        boolean mostrarPares = false;


        while (i <= numeroFin) {
            if ((i % 2 == 0 && mostrarPares) || (i % 2 != 0 && !mostrarPares)) {
                System.out.print(i + " ");
            } i++;
        }
    }
}
