package SistemaDeBiblioteca;

public class Revista extends Material{

    private int numeroEdicion;
    private String categoria;

    public int GetNumeroEdicion(){
        return numeroEdicion;
    }
    public void SetNumeroEdicion(int numeroEdicion){
        this.numeroEdicion = numeroEdicion;
    }

    public String GetCategoria(){
        return categoria;
    }
    public void SetCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override 
    public void mostrarInformacion(){
        System.out.println("ID: " + GetId());
        System.out.println("Titulo: " + GetTitulo());
        System.out.println("Numero de edicion: " + GetNumeroEdicion());
        System.out.println("Categoria: " + GetCategoria());
        System.out.println("Disponible: " + GetDisponible());
    }
}