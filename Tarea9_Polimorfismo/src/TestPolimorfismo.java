public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado[] nomina = new Empleado[4];
        nomina[0] = new EmpleadoFijo("Carlos Gomez", 3500000);
        nomina[1] = new EmpleadoPorHora("Maria Lopez", 40, 50000);
        nomina[2] = new EmpleadoFijo("Cesar Barrios", 4200000);
        nomina[3] = new EmpleadoPorHora("Ana Benitez", 60, 45000);

        System.out.println("===== NÓMINA DE EMPLEADOS =====");
        for (Empleado e : nomina) {
            System.out.println(e.getNombre() + " -> Sueldo: Gs. " + String.format("%,.0f", e.calcularSueldo()));
        }
    }
}
