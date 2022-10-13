package com.oreyo.data.table

import org.jetbrains.exposed.sql.Table

object ChallengeTable: Table() {
	
	override val tableName: String = "challenge"
	
	val challengeId = varchar("challenge_id", 128)
	val title = varchar("title", 128)
	val description = varchar("description", 256)
	val participant = integer("participant")
	val xpEarned = integer("xp_earned")
	
	override val primaryKey: PrimaryKey = PrimaryKey(challengeId)
}