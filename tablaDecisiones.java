public class tablaDecisiones {
    public static void main(String[] args) {
        String embarcacionAeronaveSocietarios = "No";
        int cantidadInmuebles = 2;
        int cantidadVehiculos = 2;
        double ingresosMensuales = 400000.0;

        if (embarcacionAeronaveSocietarios.equalsIgnoreCase("Sí")) {
            System.out.println("Pertenece al segmento de ingresos altos.");
        } else if (cantidadInmuebles >= 3) {
            System.out.println("Pertenece al segmento de ingresos altos.");
        } else if (cantidadVehiculos >= 3) {
            System.out.println("Pertenece al segmento de ingresos altos.");
        } else if (ingresosMensuales >= 489083.0) {
            System.out.println("Pertenece al segmento de ingresos altos.");

        } else {
            System.out.println("No pertenece al segmento de ingresos altos.");
        }
    }
}