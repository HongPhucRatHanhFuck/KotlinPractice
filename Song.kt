package eu.tutorials.practicekotlin

fun main() {
    val SongProfile = Song()
    println("Song: ${SongProfile.name}, Artist: ${SongProfile.artist}, Date: ${SongProfile.date}, View: ${SongProfile.view}")
    
    if (SongProfile.view <1000){
        println("This song no popular")
    } else{
        println("This song is very popular")
    }

}

class Song {
    val name: String = "Dandan kokoro hikareteku"
    val artist: String = "Phuc"
    val date: String = "29/6/2001"
    val view: Int = 100000
}