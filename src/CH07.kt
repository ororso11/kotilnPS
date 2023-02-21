import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class CH07 {
    fun readFile() {
        var currentFile = File(".")
        var file = File(currentFile.absolutePath + "/a.txt")
        var reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}