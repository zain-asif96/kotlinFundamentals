fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    
   val songInfo = Song("Ali(a.s) Pasand Hai", "Syed Raza Abbas Zaidi", 2022, 2000)
   
   songInfo.songDescription()
   println(songInfo.isPopular)
}


// 4. Song catalog
// Imagine that you need to create a music-player app.

// Create a class that can represent the structure of a song. The Song class must include these code elements:

// Properties for the title, artist, year published, and play count
// A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
// A method that prints a song description in this format:
// "[Title], performed by [artist], was released in [year published]."

class Song(
    val title: String, 
    val artist: String, 
    val releasedYear: Int,
    val playCount: Int
) {
    
    val isPopular: Boolean
    	get() = playCount >= 1000
    
    
    fun songDescription() {
        println("$title, is performed by $artist, was released in $releasedYear.")
    }

}