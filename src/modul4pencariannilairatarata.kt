import java.util.*

fun main (args : Array<String>){
        programTingkatan()
}
fun programTingkatan () {
    var scan = Scanner(System.`in`)
    var nilai=0
    println("masukkan jumlah ")
    var pilih = scan.nextInt()
    for(i in 1..pilih){
        println("data ke- $i")
        nilai = scan.nextInt()
        nilai=nilai+nilai
    }
    println("Nilai rata-Rata "+(nilai/pilih))
    println(nilai)
    println("Nilai Tertinggi")
}