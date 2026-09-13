package SistemaDeBiblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String args[]){
        ArrayList<Material> materiales = new ArrayList<>();
        int menu = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("===== BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Mostrar materiales");
            System.out.println("4. Buscar material por ID");
            System.out.println("5. Prestar material");
            System.out.println("6. Devolver material");
            System.out.println("7. Eliminar material");
            System.out.println("8. Mostrar estadísticas");
            System.out.println("9. Salir");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                Libro libro = new Libro();
                System.out.println("===== Registro de libro =====");
                System.out.println("Ingrese el ID: ");
                libro.SetId(in.nextInt());
                in.nextLine();
                System.out.println("Ingrese el titulo: ");
                libro.SetTitulo(in.nextLine());
                System.out.println("Ingrese el nombre del autor: ");
                libro.SetAutor(in.nextLine());
                System.out.println("Ingrese el numero de paginas: ");
                libro.SetNumeroPaginas(in.nextInt());
                in.nextLine();
                
                materiales.add(libro);
                System.out.println("Libro registrado correctamente");

                    break;
                case 2:
                    Revista revista = new  Revista();
                    System.out.println("===== Registro de revista =====");
                    System.out.println("Ingrese el ID: ");
                    revista.SetId(in.nextInt());
                    in.nextLine();
                    System.out.println("Ingrese el titulo: ");
                    revista.SetTitulo(in.nextLine());
                    System.out.println("Ingrese el numero de edicion: ");
                    revista.SetNumeroEdicion(in.nextInt());
                    in.nextLine();
                    System.out.println("Ingrese la categoria: ");
                    revista.SetCategoria(in.nextLine());

                    materiales.add(revista);
                    System.out.println("Revista registrada correctamente");
                    break;

                case 3:
                    System.out.println("Lista de materiales registrados");
                    for (Material material: materiales){
                        material.mostrarInformacion();
                        System.out.println("-----------------------------");
                    }
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    System.out.println("Finalizando el programa....");
                    break;
            
                default:
                    System.out.println("El valor seleccionado es invalido");
                    break;
            }

        } while (menu != 9);

        in.close();
    }
}