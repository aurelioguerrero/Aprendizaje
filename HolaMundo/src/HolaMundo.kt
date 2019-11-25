import model.Camera
import model.Movie
import model.Shoe

fun main(args: Array<String>) {
    val a = 4
    val b = 4
    var c = -2
    var d = c.unaryMinus()
    println("d = $d")
    println(b.compareTo(a))

    val name = args[0]
    println(name)

    println(a.inc())
    println(a.dec())
    println(a.times(b))
    println(a.div(b))

    val parrafo = """
        ** Párrafo de prueba.
        ** El objetivo del trimIndent al final del párrafo
        ** es mantener los saltos de línea
    """.trimIndent()

    println(parrafo.trimMargin("** "))

    val rango:IntRange = 1..10
    for(i:Int in rango)
    {
        println(i)
    }
    val numero = 2
    when(numero){
        in 1..5 -> println("Si está entre 1 y 5")
        in 1..3 -> println("Si está entre 1 y 3")
        !in 1..10 -> println("No está entre 1 y 10")
        else -> println ("no está en ninguno de los rangos")
    }

    var diasdelasemana = listOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    for (dia in diasdelasemana){
        println(dia)
    }

    for((indice,dia) in diasdelasemana.withIndex()){
        println("Día e índice $indice, $dia")
    }

    var mensaje:String?
    mensaje = null
    println(mensaje?.length)

    val paises = arrayOf("Colombia","México","Venezuela")
    val dias = arrayOf<String>("Lunes","Martes","Miércoles")
    val numeros = intArrayOf(1,2,3,4,5)

    var saludo = {println("Hola mundo!")}
    saludo()

    val camara = Camera()
    camara.turnOn()
    println(camara.getCameraStatus())

    camara.setResolution(1080)
    println("La resolución es de ${camara.getResolution()}")

    var zapato = Shoe("Shoe","Blue Shoe",1234,"Praga")
    println(zapato.toString())
    zapato.create()
    /*zapato.size = 37
    println(zapato.size)

    zapato.model = "Zapato de tacón"
    println(zapato.model)*/

    val pelicula = Movie("Coco","Pixar",120)
    println("MOVIE:")
    println(pelicula.title)
    println(pelicula.creator)
    println(pelicula.duration)

    var resultado = calculadora(1,2,3,::multiplicar)
    println("La calculadora operó una multiplicación: $resultado")
    println("La calculadora operó una resta: ${calculadora(4,5,6,::restar)}")
    println("La calculadora operó una suma: ${calculadora(4,5,6,::sumar)}")
}

fun calculadora(a: Int, b: Int, c: Int, operacion: (Int, Int, Int) -> Int): Int{
    return operacion(a,b,c)
}

fun sumar(a: Int, b: Int, c: Int) = a+b+c
fun restar(a: Int, b: Int, c: Int) = a-b-c
fun multiplicar(a: Int, b: Int, c: Int) = a*b*c