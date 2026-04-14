# Clases_de_Coleccion_y_Lambdas
Tarea de lambdas para el 14 de abril de 2026

1. El Multiplicador (ArrayList)
Escribe un método estático que dado un ArrayList<Integer>, utiliza el método replaceAll() y una expresión lambda para multiplicar cada número de la lista por un factor que recibe.

2. El Filtro Selectivo (ArrayList)
Escribe un método estático que dado un ArrayList<String>, utiliza el método removeIf() para eliminar todas las cadenas que comiencen con una letra que recibe como parámetro o que tengan una longitud menor a N caracteres. Utiliza una función que determine si alguna de las cadenas tiene la palabra taco en ella.
3. Conversor de Mayúsculas (ArrayList)
Escribe un método estático que convierte una lista de palabras a mayúsculas usando Stream y map(), y luego recolecta los resultados en un nuevo ArrayList y lo regresa.
4. Cuadrados Únicos (HashSet)
Escribe un método estático que dado un ArrayList<Integer> que contiene duplicados, crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
Tip: Utiliza una combinación de filter(), map() y Collectors.toSet().
5. Mapa de Longitudes (HashMap)
Escribe un método estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap() para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor sea su longitud.
6. Modificador de Inventario (HashMap)
Escribe un método estático que dado un HashMap<String, Double> que representa nombres de productos y sus precios. Usa el método forEach() para imprimir un catálogo donde cada precio tenga un descuento del 10% en la impresión.
Enfoque: Iterar sobre entradas de un Mapa usando lambdas de tipo Bi-Consumer.
7. Contador de Frecuencias (HashMap)
Escribe un método estático que toma un ArrayList<String> de palabras (con repeticiones). Usa merge() o compute() con una lambda para construir un mapa de frecuencias que muestre cuántas veces aparece cada palabra.

8. Clasificador de Palabras (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y sus frecuencias, usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo las palabras que cumplen con el criterio en un ArrayList.
9. Deduplicación de Palabras (HashSet)
Escribe un método estático que toma una frase larga, dividela en un array de palabras y usa un stream con lambdas para filtrar las palabras de menos de N letras, convertirlas a minúsculas y guardarlas en un HashSet para asegurar que no haya repetidas.
10. El Tope de Frecuencias (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y frecuencias, usa replaceAll() para limitar todas las frecuencias a un máximo de N. Si una frecuencia es mayor a N, debe fijarse exactamente en N mediante una lambda.


