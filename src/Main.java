import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el mensaje");
        String mensaje = lector.next();
        System.out.println("Cuántas veces quieres mover la letra");
        int veces = lector.nextInt();

        String mensajeCifrado = "";

        for(int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            boolean minuscula = (letra >= 'a' && letra <='z');
            boolean mayuscula = (letra >= 'A' && letra <='Z');
            if(!(minuscula || mayuscula))
                mensajeCifrado += letra;
            else {
                int ascii = (int)letra;
                int baseAscii = (int)'a';
                if(mayuscula)
                    baseAscii = (int)'A';
                int nuevoAscii = (ascii - baseAscii - veces+26) % 26 + baseAscii;
                char nuevaLetra = (char)nuevoAscii;
                mensajeCifrado += nuevaLetra;
            }
        }
        System.out.println(mensajeCifrado);
    }
}