import java.util.*;
import java.util.stream.Collectors;

public class utileriaNumeros {

    public static void multiplicador(ArrayList<Integer> numeros, int factor) {
        numeros.replaceAll(n -> n * factor);
        System.out.println("Numeros despues de multiplicarlos por un factor de " + factor + ": \n" + numeros);
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros) {
        HashSet<Integer> listaParesCuadrados;
        listaParesCuadrados = (HashSet<Integer>) numeros.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * n)

                .collect(Collectors.toSet());

        return listaParesCuadrados;
    }

    // No supe donde ubicar este, pero viendo que se aplica un descuento al precio, lo deje en utileriaNumeros
    public static void modificadorInventario(HashMap<String, Double> productos) {
        System.out.println("Listado de productos: ");
        productos.forEach((producto, precio) -> System.out.println("Producto: " +
                producto + ", Precio con descuento: " + precio*0.90));
        System.out.println("Para verificar que no se haya cambiado nada, imprimimos la lista: \n" + productos);
    }

    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int maximoFrecuencia) {
        frecuencias.replaceAll((k, v) ->
                v > maximoFrecuencia ? maximoFrecuencia : v);
        System.out.println("Lista de frecuencias una vez aplicado el tope de "+ maximoFrecuencia + " frecuencias: \n" + frecuencias);
    }


}
