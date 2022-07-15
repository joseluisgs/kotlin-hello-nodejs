package models

import com.benasher44.uuid.Uuid
import com.benasher44.uuid.uuid4
import extensions.toLocalDateTime
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

data class Person(val name: String, val age: Int) {
    val id: Uuid = uuid4()
    var type: Type
    val createdAt: Instant = Clock.System.now()

    init {
        if (age < 0) {
            throw IllegalArgumentException("Age can't be negative")
        }
        type = when (age) {
            in 0..17 -> Type.CHILD
            in 18..64 -> Type.ADULT
            else -> Type.SENIOR
        }
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, id=$id, " +
                "type=$type, " +
                "createdAt=${createdAt.toLocalDateTime()}}"
    }

    enum class Type {
        ADULT,
        CHILD,
        SENIOR,
    }
}

data class PersonDto(val uuid: String, val name: String, val age: Int, val type: String, val createdAt: String)

fun Person.toDto(): PersonDto {
    return PersonDto(
        uuid = id.toString(),
        name = name,
        age = age,
        type = type.name,
        createdAt = createdAt.toLocalDateTime()
    )
}

fun getPersons() = (1..10).map { Person("Person $it", (5..70).random()) }