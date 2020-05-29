fun main() {
    //
    val recetas = mutableListOf<List<String?>>()

    var option: Int
    do {
        option= getRespuesta()
        when (option) {
            1 -> {
                val receta: List<String> = getReceta();
                recetas.add(receta)
            }
            2 -> verMisRecetas(recetas)
            else -> {
                println("other");
            }

        }
    }while (option != 3)
}
fun getReceta() : List<String> {
    var ingredientesSeleccionados: MutableList<String> = mutableListOf();
    var option: Int?
    val ingredientes = mutableListOf<String>(
        "Agua" ,
        "Leche" ,
        "Carne" ,
        "Verduras" ,
        "Frutas" ,
        "Cereal" ,
        "Huevos" ,
        "Aceite")
    do {

        for ((index, ingrediente) in ingredientes.withIndex()) {
            println("${index+1} . $ingrediente")
        }
        println("0. TERMINAR RECETA")
        println("Seleccione ingrediente")
        option = readLine()?.trim()?.toInt()
        if(option != 0){
            var ingredienteSeleccionado = ingredientes.removeAt(option!!-1)
            println("Agregando $ingredienteSeleccionado a la receta")
            ingredientesSeleccionados.add(ingredienteSeleccionado);
        }

    } while(option != 0)

    return ingredientesSeleccionados
}

fun verMisRecetas(recetas: MutableList<List<String?>>){
    println("Mostrando mis recetas")
    for ((index, receta) in recetas.withIndex()) {
        println("Receta ${index+1} : $receta")
    }
}

fun getRespuesta(): Int {
    println("""
    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    """)
    return readLine()?.toInt()?: 0;
}