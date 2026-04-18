import java.util.*;
import java.util.stream.Collectors;

public class utileriaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            numeros.add(i);
        }
        palabras.add("Banana");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Platano");
        palabras.add("Banana");
        palabras.add("Pera");
        palabras.add("Platano");
        palabras.add("Banana");
        palabras.add("Banana");
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("DVD", 20.0);
        productos.put("BlueRay", 30.0);
        productos.put("CD", 15.0);
        HashMap<String, Integer> clientes = new HashMap<>();
        clientes.put("David", 2500);
        clientes.put("Jose", 3200);
        clientes.put("Aretmio", 3000);
        clientes.put("Abraham", 2900);
        clientes.put("Berrelleza", 4000);
        String tonayan = new String("The quick brown fox jumped over the lazy dog");

        multiplicador(numeros, 5);
        filtroSelectivo(palabras, "P", 4);
        conversorMayusculas(palabras);
        cuadradosUnicos(numeros);
        mapaLongitudes(palabras);
        modificadorInventario(productos);
        HashMap<String, Integer> frecuencias = contadorFrecuencias(palabras);
        clasificadorPalabras(clientes, 3000);
        deduplicacionPalabras(tonayan, 4);
        topeFrecuencias(frecuencias, 5);


    }

    public static void multiplicador(ArrayList<Integer> numeros, int factor) {
        numeros.replaceAll(n -> n * factor);
        System.out.println(numeros);
    }

    public static void filtroSelectivo(ArrayList<String> palabras, String letraAEliminar, int tamaño){
        palabras.removeIf(n -> n.toLowerCase().startsWith(letraAEliminar.toLowerCase())
                && n.length() > tamaño);
        System.out.println(palabras);
    }

    public static void conversorMayusculas(ArrayList<String> palabras) {
        ArrayList<String> mayusculas;
        mayusculas = palabras.stream()
                        .map(n -> n.toUpperCase())
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(mayusculas);
    }

    public static void cuadradosUnicos(ArrayList<Integer> numeros) {
        HashSet<Integer> listaParesCuadrados;
        listaParesCuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(listaParesCuadrados);
    }

    public static void mapaLongitudes(ArrayList<String> palabras) {
        HashMap<String, Integer> longitudesPalabras;
        longitudesPalabras = (HashMap<String, Integer>) palabras.stream()
                .collect(Collectors.toMap(s -> s, String::length, (actual, nuevo) -> actual));
        System.out.println(longitudesPalabras);
    }

    public static void modificadorInventario(HashMap<String, Double> productos) {
            productos.forEach((k, v) -> System.out.println("Producto: " +
                    k + ", Precio con descuento: " + v*0.90));
    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuenciasPalabras = new HashMap<>();

        for (String palabra : palabras) {
            frecuenciasPalabras.compute(palabra, (k, v) -> (v == null) ? 1 : v + 1);
        }

        System.out.println(frecuenciasPalabras);
        return frecuenciasPalabras;

    }

    public static void clasificadorPalabras(HashMap<String, Integer> frecuenciasPalabras, int valor) {
        ArrayList palabrasClasificadas = frecuenciasPalabras.entrySet().stream()
                .filter((palabra) -> palabra.getValue() < valor)
                .map(palabra -> palabra.getKey())
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(palabrasClasificadas);
    }

    public static void deduplicacionPalabras(String frase, int longitud) {
        String[] palabras = frase.split(" ");
        HashSet<String> palabrasDeduplicadas = (HashSet<String>) Arrays.stream(palabras)
                .filter(palabra -> palabra.length() < longitud)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println(palabrasDeduplicadas);


    }

    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int maximoFrecuencia) {
        frecuencias.replaceAll((k, v) ->
                v > maximoFrecuencia ? maximoFrecuencia : v);
        System.out.println(frecuencias);
    }
}
