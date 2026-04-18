import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Definimos los valores que vamos a necesitar
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<String> frutas = new ArrayList<String>();
        HashMap<String, Double> productos = new HashMap<>();
        HashMap<String, Integer> frecuenciasPalabras = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            // Creamos un par de numeros aleatorios
            int numeroAleatorio;
            numeroAleatorio = rnd.nextInt(20);
            if (rnd.nextBoolean()) numeroAleatorio *= -1;
            numeros.add(numeroAleatorio);
        }

        // Para lo que ocupe un ArrayList de Strings
        frutas.add("Fresas");
        frutas.add("Manzanas");
        frutas.add("Cerezas");
        frutas.add("Peras");
        frutas.add("Platanos");
        frutas.add("Duraznos");
        frutas.add("Uvas");

        // Para lo que ocupe un HashMap parametrizado por String y Double
        productos.put("DVD", 20.0);
        productos.put("BlueRay", 30.0);
        productos.put("CD", 15.0);

        // Para lo que ocupe un HashMap parametrizado por String y int
        frecuenciasPalabras.put("Uvas", 5);
        frecuenciasPalabras.put("Peras", 3);
        frecuenciasPalabras.put("Manzanas", 8);
        frecuenciasPalabras.put("Durazno", 2);
        frecuenciasPalabras.put("Mango", 0);

        // Para el ejercicio que ocupa un String
        String frase = "The quick, brown fox jumps over the lazy dog.";

        // Iniciamos los ejercicios
        // Ejercicio 1
        System.out.println("Numeros antes de multiplicarlos: \n" + numeros);
        utileriaNumeros.multiplicador(numeros, 5);
        // Ejercicio 2
        System.out.println("\nArrayList antes de aplicar el filtro: \n" + frutas);
        utileriaCadenas.filtroSelectivo(frutas, 'P', 4);
        // Ejercicio 3
        System.out.println("\nArrayList antes de convertir su contenido a mayusculas: \n" + frutas);
        System.out.println("ArrayList despues de la conversión: \n" + utileriaCadenas.conversorMayusculas(frutas));
        // Ejercicio 4
        System.out.println("\nNumeros antes de obtener una HashSet de los cuadrados de numeros pares\n" + numeros);
        System.out.println("Listado de los cuadrados de numeros pares: \n" + utileriaNumeros.cuadradosUnicos(numeros));
        // Ejercicio 5
        System.out.println("\nTamaños de cada palabra del arraylist antes de sacar su mapa de longitudes: ");
        String longitudesElementos = "";
        for (String fruta : frutas) {
            if (fruta.equals(frutas.getLast())) {
                longitudesElementos += String.valueOf(fruta.length());
                break;
            }
            longitudesElementos += String.valueOf(fruta.length()) + ", ";

        }
        System.out.println(longitudesElementos);
        System.out.println("Listado del tamaño de cada palabra: \n" + utileriaCadenas.mapaLongitudes(frutas));
        // Ejercicio 6
        System.out.println("\nLista de productos antes de aplicar los descuentos: \n" + productos);
        utileriaNumeros.modificadorInventario(productos);
        // Ejercicio 7
        frutas.clear();
        frutas.add("Fresas");
        frutas.add("Manzana");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Pera");
        frutas.add("Pera");
        frutas.add("Uvas");
        frutas.add("Uvas");
        frutas.add("Uvas");
        frutas.add("Uvas");
        HashMap<String, Integer> frecuencias = utileriaCadenas.contadorFrecuencias(frutas);
        System.out.println("Frecuencia de cada objeto de la lista: \n" + frecuencias);
        // Ejercicio 8
        System.out.println("\n Lista de palabras antes de aplicar la clasificacion: \n" + frecuenciasPalabras);
        System.out.println("Lista de palabras debajo del umbral dado: \n" + utileriaCadenas.clasificadorPalabras(frecuenciasPalabras, 5));
        // Ejercicio 9
        System.out.println("\nFrase antes de sacar el listado de palabras de menos de 5 letras: \n" + frase);
        System.out.println("Palabras que contengan menos de 5 letras: \n" + utileriaCadenas.deduplicadorPalabras(frase, 5));
        // Ejercicio 10
        System.out.println("\nLista de frecuencias antes de aplicar un tope de 3 frecuencias: \n" + frecuencias);
        utileriaNumeros.topeFrecuencias(frecuencias, 3);


    }
}
