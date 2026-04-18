import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class utileriaCadenas {
    public static void filtroSelectivo(ArrayList<String> palabras, char letraAEliminar, int tamaño){
        palabras.removeIf(n -> n.toLowerCase()
                .startsWith(String.valueOf(letraAEliminar).toLowerCase())
                || n.length() < tamaño);
        System.out.println("ArrayList despues de aplicar el filtro: \n" + palabras);

    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String> palabras) {
        ArrayList<String> mayusculas;
        mayusculas = palabras.stream()
                .map(n -> n == null ? "NULL" : n.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));

        return mayusculas;
    }

    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras) {
        HashMap<String, Integer> longitudesPalabras;
        longitudesPalabras = (HashMap<String, Integer>) palabras.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        String::length,
                        (actual, nuevo) -> actual));

        return longitudesPalabras;

    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuenciasPalabras = new HashMap<>();
        System.out.println("\nContenido de la lista: \n" + palabras);
        for (String palabra : palabras) {
            frecuenciasPalabras.compute(palabra, (k, v) -> (v == null) ? 1 : v + 1);
        }

        return frecuenciasPalabras;
    }

    // En los criterios sale como clasificadorCalificaciones, pero le deje el nombre que venia en el documento
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuenciasPalabras, int umbral) {
        ArrayList<String> palabrasClasificadas =
                (ArrayList<String>) frecuenciasPalabras.entrySet().stream()
                .filter((palabra) -> palabra.getValue() < umbral)
                .map(palabra -> palabra.getKey())
                .collect(Collectors.toList());

        return palabrasClasificadas;
    }

    public static HashSet<String> deduplicadorPalabras(String frase, int longitud) {
        if (frase == null || frase.isEmpty()) return new HashSet<>();
        String[] palabras = frase.split("\\W+");
        HashSet<String> palabrasDeduplicadas = (HashSet<String>) Arrays.stream(palabras)
                .filter(palabra -> palabra != null && palabra.length() < longitud)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        return palabrasDeduplicadas;
    }
}
