package com.ibm.kotlin.delegation

interface Downloader {
    fun download()
}

interface Player {
    fun play()
}

class FiledDownloader(val fileName: String) : Downloader {
    override fun download() {
        println("$fileName is downloaded")
    }
}

class FilePlayer(val fileName: String) : Player {
    override fun play() {
        println("$fileName is Playing")
    }
}

//without delegation
//class MediaFile(private val downloader: Downloader, private val player: Player) : Downloader, Player {
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }
//}
class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader by downloader, Player by player {}

fun main() {
    val mediFile = MediaFile(FiledDownloader("movie.mp4"), FilePlayer("movie.mp4"))
    mediFile.play()
    mediFile.download()
}