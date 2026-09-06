package SistemaDeBiblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String args[]){
        ArrayList<Material> materiales;
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
                    
                    break;
                case 2:
                    break;

                case 3:
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