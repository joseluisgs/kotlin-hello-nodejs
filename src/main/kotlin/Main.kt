import models.Person
import models.getPersons
import models.toDto
import modules.sorted

/**
 * Tenemos dos formas de importar los módulos de NPM y node
 * Uno es haciendo de la forma en ficheros como is-sorted
 * el otro es usando la funcion requiere de nodejs
 */

external fun require(module: String): dynamic

fun main() {
    // Podemos usar Kotlin para hacer todo en Node.js
    println("Hello, Node.js!")
    // Ejemplo de las clases y código Kotlin
    val p = Person("John", 21)
    println(p)
    val c = p.copy(age = 22)
    println(c)
    // ejemplo de la prueba de un módulo
    println(sorted(arrayOf(1, 2, 3)))
    println(sorted(arrayOf(3, 1, 2)))

    // Obtenemos las personas
    val persons = getPersons()
    persons.forEach { println(it) }

    val express = require("express")

    val app = express()
    app.listen(3000) {
        println("Listening on port 3000")
    }

    app.get("/persons") { _, res ->
        val personsDto = persons.map { it.toDto() }
        res.send(personsDto)
    }
}