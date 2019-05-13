class HelloFileIO {

    static void main(String[] agrs){

        def path ='E:\\mypython.txt'
        new File(path).eachLine {
            oneLine ->
                println("line: $oneLine")
        }

        File file = new File(path)

        println file.text

        file.withWriter {
            write ->
                write.writeLine('hello')
        }

        println "the file ${file.absolutePath} has ${file.length()} bytes"

        println "File ? ${file.isFile()}"
        println "Dir ? ${file.isDirectory()}"

        File file1 = new File("E:\\gr")
        file1.mkdir()
        file1.delete()
    }


}
