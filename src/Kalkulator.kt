import java.util.Scanner

class Kalkulator {
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    fun bagi(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw ArithmeticException("Tidak dapat membagi dengan nol")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val kalkulator = Kalkulator()

    var lanjut = true
    while (lanjut) {
        print("Masukkan operasi matematika (+, -, *, /): ")
        val operasi = scanner.next()

        println("Masukkan bilangan pertama: ")
        val bilangan1 = scanner.nextDouble()
        println("Masukkan bilangan kedua: ")
        val bilangan2 = scanner.nextDouble()

        when (operasi) {
            "+" -> println("Hasil tambah: ${kalkulator.tambah(bilangan1, bilangan2)}")
            "-" -> println("Hasil kurang: ${kalkulator.kurang(bilangan1, bilangan2)}")
            "*" -> println("Hasil kali: ${kalkulator.kali(bilangan1, bilangan2)}")
            "/" -> {
                try {
                    println("Hasil bagi: ${kalkulator.bagi(bilangan1, bilangan2)}")
                } catch (e: ArithmeticException) {
                    println("Error: ${e.message}")
                }
            }
            else -> println("Operasi tidak valid")
        }

        println("Apakah Anda ingin melanjutkan? (ya/tidak) ")
        val pilihan = scanner.next()
        lanjut = pilihan.equals("ya", ignoreCase = true)
    }
}
