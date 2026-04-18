# Clases de Coleccion y Lambdas
## Hecho por Derek Ramón Garzón Vizcarra

Este repositorio contiene 10 métodos estáticos realizados en Java los cuales demuestran de una manera simple el uso de las clases de coleccion ArrayList, HashMap y HashSets, asi como los lambdas y flujos de datos. 
Como se solicitó el uso de 2 clases, asi como una clase Main, a continuación se explica el contenido de cada clase:
1. utileriaCadenas -> Esta clase contiene 6 métodos estáticos relacionados a las operaciones que usen cadenas o su valor de retorno tenga que ver con estas.
2. utileriaNumeros -> Esta clase contiene 4 métodos estáticos relacionados a operaciones matemáticas con numeros.
3. Main -> Esta es la clase donde se ejecuta e inicializa todo, asi como la que realiza las pruebas con el fin de mostrarlas en consola.


## Explicaciones de los métodos
A continuación se presenta una breve explicacion de cada metodo:

### El Multiplicador:
Este método modifica un ArrayList de valores enteros de tal forma que cada elemento dentro de este se multiplique por un factor dado, para su resolución se uso el metodo replaceAll.

### El Filtro Selectivo:
Este método modifica una lista de palabras, donde se eliminan todas las palabras que empiezan por un caracter especificado o con una longitud menor a otro valor especificado, este ejercicio usa el metodo removeIf para realizar este filtrado.

### Conversor de Mayusculas:
Este método funciona como el metodo toUpperCase() de un string, aplicado para un ArrayList, se va a obtener una nueva lista con las cadenas del ArrayList transformadas en mayusculas, esto siendo manejado por el método .map.

### Cuadrados Únicos: 
Este método filtra los numeros pares de una lista dada, para despues calcular el cuadrado y almacenar estos datos en una HashSet para evitar datos duplicados. En este ejercicio se uso la combinación del método .filter, .map y .collect.

### Mapa de Longitudes:
Este método transforma una lista de palabras en un HashMap donde la clave es la palabra y su valor es la cantidad de caracteres de esta. Para este ejercicio se usó el método .collect, asi como el método Collectors.toMap.

### Modificador de Inventario:
Este método recorre un HashMap de productos y precios donde a cada elemento se le aplica un descuento del 10%. Cabe mencionar que esta el HashMap no se debe alterar en este ejercicio.

### Contador de Frecuencias: 
Este método recibe un ArrayList de palabras y crea un HashMap donde se calcula cuantas veces se repite una palabra utilizando una lógica de acumulación totalmente con lambdas. Para este ejercicio se usó el método .compute.

### Clasificador de Palabras:
Este método recibe un HashMap de frecuencias con el fin de obtener todas las palabras que superen un umbral especificado. Para este ejercicio se uso el método entrySet() para poder obtener la clave y valor de cada elemento.

### Deduplicación de Palabras:
Este método procesa una frase larga para extraer palabras menores a una longitud especificada, para luego pasarlas a minusculas e incluirlas en un HashSet con el fin de evitar duplicados. Para dividir la frase se utilizo el metodo .split().

### El Tope de Frecuencias:
Este método ajusta los valores de un HashMap de frecuencias con el fin de hacer que todos los valores no puedan superar un limite especificado. De igual forma que el primer ejercicio, se utilizo el método replaceAll.

## Instrucciones de compilación y ejecución

Para compilar y ejecutar cada codigo, se necesita realizar lo siguiente:
* Clonar el repositorio en el IDE de su elección: https://github.com/Derek2195-git
* Compilar los archivos y asegurarse que están clonados de forma correcta en el IDE
* Ejecutar la clase Main.

## Ejemplos de salida

Si se ejecutó la clase Main de forma exitosa, el resultado de ejecución deberia ser el siguiente:
```
Numeros antes de multiplicarlos: 
[-10, -18, 6, 18, -19, -4, -17, 16, 11, 1, -10, 7, 18, 11, 19]
Numeros despues de multiplicarlos por un factor de 5: 
[-50, -90, 30, 90, -95, -20, -85, 80, 55, 5, -50, 35, 90, 55, 95]

ArrayList antes de aplicar el filtro: 
[Fresas, Manzanas, Cerezas, Peras, Platanos, Duraznos, Uvas]
ArrayList despues de aplicar el filtro: 
[Fresas, Manzanas, Cerezas, Duraznos, Uvas]

ArrayList antes de convertir su contenido a mayusculas: 
[Fresas, Manzanas, Cerezas, Duraznos, Uvas]
ArrayList despues de la conversión: 
[FRESAS, MANZANAS, CEREZAS, DURAZNOS, UVAS]

Numeros antes de obtener una HashSet de los cuadrados de numeros pares
[-50, -90, 30, 90, -95, -20, -85, 80, 55, 5, -50, 35, 90, 55, 95]
Listado de los cuadrados de numeros pares: 
[400, 6400, 2500, 8100, 900]

Tamaños de cada palabra del arraylist antes de sacar su mapa de longitudes: 
6, 8, 7, 8, 4
Listado del tamaño de cada palabra: 
{Fresas=6, Cerezas=7, Duraznos=8, Uvas=4, Manzanas=8}

Lista de productos antes de aplicar los descuentos: 
{CD=15.0, DVD=20.0, BlueRay=30.0}
Listado de productos: 
Producto: CD, Precio con descuento: 13.5
Producto: DVD, Precio con descuento: 18.0
Producto: BlueRay, Precio con descuento: 27.0
Para verificar que no se haya cambiado nada, imprimimos la lista: 
{CD=15.0, DVD=20.0, BlueRay=30.0}

Contenido de la lista: 
[Fresas, Manzana, Manzana, Pera, Pera, Pera, Uvas, Uvas, Uvas, Uvas]
Frecuencia de cada objeto de la lista: 
{Pera=3, Fresas=1, Manzana=2, Uvas=4}

 Lista de palabras antes de aplicar la clasificacion: 
{Durazno=2, Mango=0, Peras=3, Uvas=5, Manzanas=8}
Lista de palabras debajo del umbral dado: 
[Durazno, Mango, Peras]

Frase antes de sacar el listado de palabras de menos de 5 letras: 
The quick, brown fox jumps over the lazy dog.
Palabras que contengan menos de 5 letras: 
[the, over, lazy, dog, fox]

Lista de frecuencias antes de aplicar un tope de 3 frecuencias: 
{Pera=3, Fresas=1, Manzana=2, Uvas=4}
Lista de frecuencias una vez aplicado el tope de 3 frecuencias: 
{Pera=3, Fresas=1, Manzana=2, Uvas=3}
```
