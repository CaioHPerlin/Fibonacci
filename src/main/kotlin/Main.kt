fun main() {
    println("# SEQUÊNCIA DE FIBONACCI")
    println("# encontre o número correspondente à posição digitada")
    println("# digite -1 para sair")
    while(true) {
        print("Digite a posição desejada: ")
        val pos = readln().toInt()
        when{
            pos == -1 -> break
            pos <= 0 -> println("Posição inválida")
            else -> println("Número $pos da sequência fibonacci: ${fibonacci(pos)}")
        }
    }
}

fun fibonacci(n: Int): Int {
    if(n <= 1){
        return n
    }else{
        return(fibonacci(n-1) + fibonacci(n-2))
    }
}

