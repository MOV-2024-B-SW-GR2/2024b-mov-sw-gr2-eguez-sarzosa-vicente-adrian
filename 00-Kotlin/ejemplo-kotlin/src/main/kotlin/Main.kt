import java.util.*

fun main(args: Array<String>) {
    // INMUTABLES (No se RE ASIGNA "=")
    val inmutable: String = "Adrian";
    // inmutable = "Vicente" // Error!
    // MUTABLES
    var mutable: String = "Vicente"
    mutable = "Adrian" // Ok
    // VAL > VAR


    // Duck Typing
    val ejemploVariable = " Adrian Eguez "
    ejemploVariable.trim()
    val edadEjemplo: Int = 12
    // ejemploVariable = edadEjemplo // Error!
    // Variables Primitivas
    val nombreProfesor: String = "Adrian Eguez"
    val sueldo: Double = 1.2
    val estadoCivil: Char = 'C'
    val mayorEdad:Boolean = true
    // Clases en Java
    val fechaNacimiento: Date = Date()




    // When (Switch)
    val estadoCivilWhen = "C"
    when (estadoCivilWhen){
        ("C") ->{
            println("Casado")
        }
        "S" -> {
            println("Soltero")
        }
        else ->{
            println("No sabemos")
        }
    }
    val esSoltero = (estadoCivilWhen == "S")
    val coqueteo = if (esSoltero) "Si" else "No" // if else chiquito


    imprimirNombre("ADRIAN")


}

fun imprimirNombre(nombre:String): Unit{
    fun otraFuncionAdentro(){
        println("Otra funcion adentro")
    }
    println("Nombre: $nombre") // Uso sin llaves
    println("Nombre: ${nombre}") // Uso con llaves opcional
    println("Nombre: ${nombre + nombre}") // Uso con llaves (concatenado)
    println("Nombre: ${nombre.toString()}") // uso con llaves (funcion)
    println("Nombre: $nombre.toString()") // INCORRECTO!
                                          // (no pueden usar sin llaves)
    otraFuncionAdentro()
}