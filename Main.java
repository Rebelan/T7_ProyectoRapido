import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Seleccionar una carpeta");
        System.out.println("2. Leer un fichero");
        System.out.println("3. Convertir a ...");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int a = sc.nextInt();

        switch (a) {
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

                break;

            default:
                break;
        }

        sc.close();
    }
}