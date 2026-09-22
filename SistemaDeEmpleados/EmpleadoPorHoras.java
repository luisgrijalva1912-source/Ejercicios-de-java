package SistemaDeEmpleados;

public class EmpleadoPorHoras extends Empleado {
    //atributos adicionales
    private double horasTrabajadas;
    private double pagoPorHora;

    //getters y setters
    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getPagoPorHora(){
        return pagoPorHora;
    }
    public void setPagoPorHora(double pagoPorHora){
        this.pagoPorHora = pagoPorHora;
    }

    //polimorfismo
    @Override
    public double calcularSalario(){
        return getHorasTrabajadas() * getPagoPorHora();
    }
    @Override
    public void mostrarInformacion(){

    }
}