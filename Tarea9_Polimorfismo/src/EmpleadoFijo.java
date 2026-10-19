public class EmpleadoFijo extends Empleado {
    private double sueldoMensual;

    public EmpleadoFijo(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoMensual;
    }
}
