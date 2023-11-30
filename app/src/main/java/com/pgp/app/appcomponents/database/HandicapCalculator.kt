package com.pgp.app.appcomponents.database

class HandicapCalculator(private val handicapDao: HandicapDao) {

    fun calculateHandicap(): Double {
        val handicaps = handicapDao.getAll().sortedBy { it.ScoreDifferential }
        val size = handicaps.size

        return when {
            size < 3 -> handicaps.first().ScoreDifferential - 2.0
            size < 4 -> handicaps.first().ScoreDifferential - 1.0
            size < 5 -> handicaps.first().ScoreDifferential
            size < 7 -> averageOfLowest(handicaps, 2) - 1.0
            size < 9 -> averageOfLowest(handicaps, 2)
            size < 12 -> averageOfLowest(handicaps, 3)
            size < 15 -> averageOfLowest(handicaps, 4)
            size < 17 -> averageOfLowest(handicaps, 5)
            size < 19 -> averageOfLowest(handicaps, 6)
            size < 20 -> averageOfLowest(handicaps, 7)
            else -> averageOfLowest(handicaps, 8)
        }
    }

    private fun averageOfLowest(handicaps: List<Handicap>, count: Int): Double {
        return handicaps.take(count).averageBy { it.ScoreDifferential }
    }
}

// Extension function to calculate the average of a list of Handicaps
private fun List<Handicap>.averageBy(selector: (Handicap) -> Double): Double {
    return map(selector).average()
}