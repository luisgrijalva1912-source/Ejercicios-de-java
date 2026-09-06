package SistemaDeBiblioteca;

public class Libro extends Material {
    
    private String autor;
    private int numeroPaginas;

    public String GetAutor(){
        return autor;
    }
    public void SetAutor(String autor){
        this.autor = autor;
    }

    public int GetNumeroPaginas(){
        return numeroPaginas;
    }
    public void SetNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    @Override 
    public void mostrarInformacion(){
        System.out.println("ID: " + GetId());
        System.out.println("Titulo: " + GetTitulo());
        System.out.println("Autor: " + GetAutor());
        System.out.println("Paginas: " + GetNumeroPaginas());
        System.out.println("Disponible: " + GetDisponible());
    }
}