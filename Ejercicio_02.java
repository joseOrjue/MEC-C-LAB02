import java.util.*;

public class Ejercicio_02 {

    public static void main(String[] args) {
        
        // Leer una línea de caracteres desde la consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una linea de caracteres: ");
        String linea = sc.nextLine();
        
        // Obtener el carácter que más veces se repite en la línea
        char caracterRepetido = obtenerCaracterMasRepetido(linea);
        
        // Sustituir las vocales por el carácter más repetido
        String lineaSinVocales = sustituirVocales(linea, caracterRepetido);
        
        // Invertir el orden de las letras
        String lineaInvertida = invertirLinea(linea);
        
        // Mostrar los resultados
        System.out.println("Linea original: " + linea);
        System.out.println("Linea sin vocales: " + lineaSinVocales);
        System.out.println("Linea invertida: " + lineaInvertida);
        
    }
    
    public static char obtenerCaracterMasRepetido(String linea) {
        // Crear un mapa que almacena la frecuencia de cada carácter en la línea
        Map<Character, Integer> frecuencia = new HashMap<>();
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }
        
        // Encontrar el carácter con mayor frecuencia
        char caracterMasRepetido = ' ';
        int maxFrecuencia = 0;
        for (char c : frecuencia.keySet()) {
            int f = frecuencia.get(c);
            if (f > maxFrecuencia) {
                caracterMasRepetido = c;
                maxFrecuencia = f;
            }
        }
        return caracterMasRepetido;
    }
    
    public static String sustituirVocales(String linea, char caracter) {
        // Sustituir las vocales por el carácter dado
        String nuevaLinea = "";
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if (esVocal(c)) {
                nuevaLinea += caracter;
            } else {
                nuevaLinea += c;
            }
        }
        return nuevaLinea;
    }
    
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
    public static String invertirLinea(String linea) {
        // Invertir el orden de las letras
        String nuevaLinea = "";
        for (int i = linea.length() - 1; i >= 0; i--) {
            nuevaLinea += linea.charAt(i);
        }
        return nuevaLinea;
    }
}


