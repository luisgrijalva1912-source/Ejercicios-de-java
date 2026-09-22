package SistemaDeEmpleados;

public class Pruebas {
    public static void main(String args[]){
        EmpleadoPorHoras empleado = new EmpleadoPorHoras();

        empleado.setHorasTrabajadas(44);
        empleado.setPagoPorHora(100);

        System.out.println(empleado.calcularSalario());
    }
}
