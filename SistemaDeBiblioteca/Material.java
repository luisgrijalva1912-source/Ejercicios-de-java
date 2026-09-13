package SistemaDeBiblioteca;

public abstract class Material {
    private int id;
    private String titulo;
    private boolean disponible = true;

    public int GetId(){
        return id;
    }
    public void SetId(int id){
        this.id = id;
    }

    public String GetTitulo(){
        return titulo;
    }
    public void SetTitulo(String titulo){
        this.titulo = titulo;
    }

    public boolean GetDisponible(){
        return disponible;
    }
    public void SetDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public abstract void mostrarInformacion();
}
