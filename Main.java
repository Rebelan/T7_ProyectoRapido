import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            int op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("1. .csv");
                    System.out.println("2. .json");
                    System.out.println("3. .xml");
                    System.out.print("¿A qué extensión quieres convertir?: ");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }

                    break;

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            sc.close();
        }

    }

    public static void menu() {
        System.out.println("1. Seleccionar una carpeta");
        System.out.println("2. Leer un fichero");
        System.out.println("3. Convertir op ...");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
}