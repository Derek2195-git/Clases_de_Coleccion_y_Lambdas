import java.util.*;
import java.util.stream.Collectors;

public class TareaLambdas {
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
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("DVD", 20.0);
        productos.put("BlueRay", 30.0);
        productos.put("CD", 15.0);


        multiplicador(numeros, 5);
        filtroSelectivo(palabras, "P", 4);
        conversorMayusculas(palabras);
        cuadradosUnicos(numeros);
        mapaLongitudes(palabras);
        modificadorInventario(productos);


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
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(longitudesPalabras);
    }

    public static void modificadorInventario(HashMap<String, Double> productos) {
            productos.forEach((k, v) -> System.out.println("Producto: " +
                    k + ", Precio con descuento: " + v*0.90));
    }

    public static void contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuenciasPalabras = null;

        palabras.stream()
                .collect(Collectors.toList(frecuenciasPalabras.compute(k, (k, v) -> v - 1)))
    }
}""
