package SistemaDeEmpleados;

public abstract class Empleado {
    //atributos generales
    private String id;
    private String nombre;

    //getters y setters
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //constructor vacio
    public Empleado(){

    }
    //dos metodos abstractos
    public abstract double calcularSalario();

    public abstract void mostrarInformacion();
    
}
