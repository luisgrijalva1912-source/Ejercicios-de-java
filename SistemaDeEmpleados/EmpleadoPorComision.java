package SistemaDeEmpleados;

public class EmpleadoPorComision extends Empleado{
    //atributos adicionales
    private double ventas;
    private double porcentajeComision;

    //getters y setters
    public double getVentas(){
        return ventas;
    }
    public void setVentas(double ventas){
        this.ventas = ventas;
    }
    public double getporcentajeComision(){
        return porcentajeComision;
    }
    public void setPorcentajeComision(double porcentajeComision){
        this.porcentajeComision = porcentajeComision;
    }

    //polimorfismo
    @Override
    public double calcularSalario(){
        return (getVentas() * getporcentajeComision())/100;
    }
    @Override 
    public void mostrarInformacion(){
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + calcularSalario());
    }
}