import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    val nama: String = mutableListOf("ag", "op", "yo").toString()
    var password1:String
    var password2:String
    var username:String="INPUT"


    while (username !in nama) {
        print("Masukkan Username: ")
        username =input.nextLine()

        if (username in nama){
            println("Selamat anda login")
            break
        }else{
            println("Maaf Coba Lagi")
        }
    }
    println("Program berakhir")






}


