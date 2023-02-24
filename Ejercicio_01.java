
   
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_01  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Pedimos al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamanio del arreglo: ");
        int tam = sc.nextInt();
       
        // Creamos el arreglo y lo llenamos con números aleatorios
        int[] arr = new int[tam];
        Random rand = new Random();
        for (int i = 0; i < tam; i++) {
            arr[i] = rand.nextInt(100);
        }
       
        // Imprimimos el arreglo para verificar que se llenó correctamente
        System.out.println("Arreglo generado: " + Arrays.toString(arr));
       
        // Calculamos la media
        double media = 0;
        for (int i = 0; i < tam; i++) {
            media += arr[i];
        }
        media /= tam;
        System.out.println("Media: " + media);
       
        // Calculamos la mediana
        Arrays.sort(arr);
        double mediana;
        if (tam % 2 == 0) {
            mediana = (arr[tam/2 - 1] + arr[tam/2]) / 2.0;
        } else {
            mediana = arr[tam/2];
        }
        System.out.println("Mediana: " + mediana);
       
        // Calculamos la varianza
        double varianza = 0;
        for (int i = 0; i < tam; i++) {
            varianza += Math.pow(arr[i] - media, 2);
        }
        varianza /= tam;
        System.out.println("Varianza: " + varianza);
       
        // Calculamos la desviación estándar
        double desvEst = Math.sqrt(varianza);
        System.out.println("Desviación estándar: " + desvEst);
       
        // Calculamos la moda
        int moda = arr[0];
        int modaCount = 1;
        int count = 1;
        for (int i = 1; i < tam; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                if (count > modaCount) {
                    modaCount = count;
                    moda = arr[i-1];
                }
                count = 1;
            }
        }
        if (count > modaCount) {
            moda = arr[tam-1];
        }
        System.out.println("Moda: " + moda);
    }

}
