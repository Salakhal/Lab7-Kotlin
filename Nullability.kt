
data class Student(val fullName: String, var id: Int, var grade: Double)

// Liste de données initiale
val students = listOf(
    Student("John", 223, 140.0),
    Student("Mark", 548, 120.0),
    Student("Natali", 342, 150.0),
    Student("Sara", 781, 130.0)
)

/**
 * Utilise l'opérateur !! (Not-null assertion)
 * Si l'ID n'existe pas, cette fonction déclenche une NullPointerException (NPE).
 */
fun getStudentById(id: Int): Student {
    return students.find { it.id == id }!!
}

/**
 * Retourne un type nullable Student?
 * Si le nom n'est pas trouvé, la fonction retourne null sans crasher.
 */
fun searchInStudents(name: String): Student? {
    return students.find { it.fullName.lowercase() == name.lowercase() }
}

fun main() {
    println("--- Test 1 : Recherche par ID (Risque de NPE avec !!) ---")
    print("Please, Enter the student's ID: ")
    val idInput = readlnOrNull()?.toIntOrNull()
    
    if (idInput != null) {
        // Attention : Si l'ID n'est pas dans la liste, ça va crasher ici !
        println("Result: ${getStudentById(idInput)}")
    }

    println("\n--- Test 2 : Recherche par Nom (Sécurisée avec ?:) ---")
    print("Please, Enter the student's name: ")
    val name = readlnOrNull() ?: ""
    
    // Utilisation de l'opérateur Elvis pour afficher un message par défaut
    val result = searchInStudents(name)
    println("Result: ${result ?: "the student is not found"}")
}