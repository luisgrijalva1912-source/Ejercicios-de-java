package SistemaDeEmpleados;

public class Pruebas {
    public static void main(String args[]){
        EmpleadoFijo empleado = new EmpleadoFijo();

        //private double salarioMensual;
        empleado.setSalarioMensual(3500);


        System.out.println(empleado.calcularSalario());
    }
}
