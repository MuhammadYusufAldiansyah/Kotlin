import java.util.Scanner; //ini untuk munculin input data agar bisa jalan
fun main() {
    var input = Scanner(System.`in`) //input sebagai nama dari variabel
    var username= mutableListOf("pio","tio","deo","leo")
    username.add("klee")//menambahkan value String "Klee" ke dalam list username
    var usernamefix=username.toString()//variabel username mentrasfer datanya ke dalam variabel usernamefix
    for (i in 1..3) { //selama i di dalam jarak 1 sampai 3
        print("Masukkan Username: ")//memasukkan input
        var jawab = input.nextLine().lowercase() //memasukan input kedalam scanner + to_lower_case untuk memperkecil font input
        if (jawab in usernamefix) { // jika input jawab ada di dalam list usernamefix maka:
            println("Selamat")// cetak "Selamat anda login"
            break// sebagai penentu akhir sebuah operasi
        } else {//selain itu "False"
            println("ulang")// cetak "Maaf ulangi username anda

        }


    }

    println("Program berakhir")// jika sudah bernilai "true" atau bernilai "false" sebanyak 3X maka program berhenti
}