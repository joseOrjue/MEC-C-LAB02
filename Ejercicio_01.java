
   
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;


public class Ejercicio_01 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamanio del arreglo: ");

        int tamanio = scanner.nextInt();


        int[] arreglo = new int[tamanio];

        Random random = new Random();


        for (int i = 0; i < tamanio; i++) {

            arreglo[i] = random.nextInt(100);

        }


        System.out.println("El arreglo generado es: " + Arrays.toString(arreglo));

        System.out.println("¿Que cálculo desea realizar? ");

        System.out.println("1. Media");

        System.out.println("2. Mediana");

        System.out.println("3. Varianza");

        System.out.println("4. Desviación estándar");

        System.out.println("5. Moda");


        int opcion = scanner.nextInt();


        switch (opcion) {

            case 1:

                double media = calcularMedia(arreglo);

                System.out.println("La media es: " + media);

                break;

            case 2:

                double mediana = calcularMediana(arreglo);

                System.out.println("La mediana es: " + mediana);

                break;

            case 3:

                double varianza = calcularVarianza(arreglo);

                System.out.println("La varianza es: " + varianza);

                break;

            case 4:

                double desviacionEstandar = calcularDesviacionEstandar(arreglo);

                System.out.println("La desviación estándar es: " + desviacionEstandar);

                break;

            case 5:

                int moda = calcularModa(arreglo);

                System.out.println("La moda es: " + moda);

                break;

            default:

                System.out.println("Opción inválida");

                break;

        }

    }


    public static double calcularMedia(int[] arreglo) {

        double suma = 0;


        for (int valor : arreglo) {

            suma += valor;

        }


        return suma / arreglo.length;

    }


    public static double calcularMediana(int[] arreglo) {

        Arrays.sort(arreglo);

        int indiceMedio = arreglo.length / 2;


        if (arreglo.length % 2 == 0) {

            return (arreglo[indiceMedio - 1] + arreglo[indiceMedio]) / 2.0;

        } else {

            return arreglo[indiceMedio];

        }

    }


    public static double calcularVarianza(int[] arreglo) {

        double media = calcularMedia(arreglo);

        double sumaCuadrados = 0;


        for (int valor : arreglo) {

            sumaCuadrados += Math.pow(valor - media, 2);

        }


        return sumaCuadrados / arreglo.length;

    }


    public static double calcularDesviacionEstandar(int[] arreglo) {

        double varianza = calcularVarianza(arreglo);

        return Math.sqrt(varianza);

    }


    public static int calcularModa(int[] arreglo) {

        int moda = arreglo[0];

        int frecuenciaModa = 0;


        for (int i = 0; i < arreglo.length; i++) {

            int frecuencia = 1;


            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[j] == arreglo[i]) {

                    frecuencia++;

                }

            }

        

        

        

        

        

    }

        return 0;

    

    }

    

   

}


