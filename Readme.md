Este será una interfaz que nos permitirá crear nuestras propias recetas a partir de una lista de insumos (ingredientes) previamente definidos.

Podemos tener ingredientes de tipo

Agua
Leche
Carne
Verduras
Frutas
Cereal
Huevos
Aceite
E ir navegando en la aplicación seleccionando ingredientes hasta terminar nuestra receta.

Así que comencemos con el primer Reto.
Crea un nuevo proyecto en Kotlin y nómbralo RecipesMaker.

Crea un menú que muestre las siguientes opciones:

:: Bienvenido a Recipe Maker ::


Selecciona la opción deseada

>1. Hacer una receta
>2. Ver mis recetas
>3. Salir
El programa deberá ser capaz de leer la respuesta del usuario e imprimirla, la única forma de salir de él y terminarlo es con la opción 3.


Tips
Puedes utilizar lo siguiente para lograrlo:

Raw Strings
Lectura desde teclado en Kotlin val response:String? = readLine()
Control de flujo. If else, when, do while
Break Labels
