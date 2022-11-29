
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int opcion;

        Scanner entrada = new Scanner(System.in);
        boolean uno = false;
        do {
            String cadenas = "";
            System.out.println("***************");
            System.out.println("");
            System.out.println("***************");
            System.out.println("1. Introducir cadena: ");
            System.out.println("2. Capitalizar la cadena: ");
            System.out.println("3. Sustituir los espacios en blanco por_ ");
            System.out.println("4. Salir");
            System.out.print("Introduce la opción: ");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    pedirCadena();
                    uno = true;
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Error");
                    break;

            }
        } while (uno == false);

        do {
            System.out.println("***************");
            devolverCadena();
            System.out.println("***************");
            System.out.println("1. Introducir cadena: ");
            System.out.println("2. Capitalizar la cadena: ");
            System.out.println("3. Sustituir los espacios en blanco por_ ");
            System.out.println("4. Salir");
            System.out.print("Introduce la opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    pedirCadena();
                    break;
                case 2:
//                    capitalizarCadena();
                    break;
                case 3:
//                    sustituirBlancos(cadenas);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Error");
                    break;

            }

        } while (opcion != 4);
    }

    public static void devolverCadena() {
        String cadena = pedirCadena();
        System.out.println(cadena);
    }

    public static String pedirCadena() {
        String cadena = "";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir nueva cadena: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: " + cadena);
        return cadena;

    }

    public static void capitalizarCadena(String frase) {
        char caracter, caracterMayus;

        String resultado = "";
        String iniciales = "";

        frase = frase.trim();

        caracter = frase.charAt(0);
        caracterMayus = Character.toUpperCase(caracter);
        resultado = resultado + caracterMayus;

        for (int i = 1; i < frase.length(); i++) {

            if (frase.charAt(i - 1) == ' ') {

                caracter = frase.charAt(i);
                caracterMayus = Character.toUpperCase(caracter);
                resultado = resultado + caracterMayus;
            } else {
                caracter = frase.charAt(i);
                resultado = resultado + caracter;
            }
        }
        System.out.println(resultado);

        iniciales = iniciales + frase.charAt(0);

        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i - 1) == ' ') {
                //El caracter anterior es un espacio
                //añado el caracter actual
                iniciales = iniciales + frase.charAt(i);
            }

        }

    }

    public static void sustituirBlancos(String frase) {
        String resultado = "";

        resultado = frase.replace(' ', '_');

        System.out.println(resultado);
    }

}
