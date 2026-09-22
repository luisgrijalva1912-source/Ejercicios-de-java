package SistemaDeEmpleados;

public class EmpleadoFijo extends Empleado{
    //atributo extra
    private double salarioMensual;

    //getters y setters
    public double getSalarioMensual(){
        return salarioMensual;
    }
    public void setSalarioMensual(double salarioMensual){
        this.salarioMensual = salarioMensual;
    }

    //polimorfismo
    @Override 
    public double calcularSalario(){
        return salarioMensual;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + calcularSalario());
    }
}
