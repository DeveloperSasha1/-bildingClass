package com.skillbox.learnkotlin

fun main() {
    val world = "Актия"
    val playerName = "Алекс"
    val playerAge = 30
    var playerLives = 3
    var playerMoney = 6.5
    var isSaveGame = true
    var playerRice = "Humans"

    playerLives = checkSaveGames(isSaveGame, playerLives)
    printPlayerRice(playerRice)
    printPlacePlayer()
    printPlayer(world, playerName, playerAge, playerLives, playerMoney)


}



fun checkSaveGames(isSaveGame: Boolean, playerLives: Int): Int {
    var playerLives1 = playerLives
    if (isSaveGame) {
        println("LoadGame...")
        println("StartGame...")
        playerLives1 = 2
    } else {
        println("Start New Game")
    }
    return playerLives1
}



fun printPlayerRice(playerRice: String) {
    when (playerRice) {
        "Humans" -> println("Раса игрока Люди")
        "Ork" -> println("Раса игрока Орки")
        "Demons" -> println("Раса игрока Демоны")
    }
}



fun printPlacePlayer() {
    when (25) {
        in 1..5 -> println("OK")
        in 6..10 -> println("10")
        else -> println("NO")
    }
}



fun printPlayer(
    world: String,
    playerName: String,
    playerAge: Int,
    playerLives: Int,
    playerMoney: Double
) {
    println("Мир: $world")
    println("Игрок $playerName готов")
    println("Возраст: $playerAge")
    println("Жизни: $playerLives")
    println("Деньги: $playerMoney")
}