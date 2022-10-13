package com.oreyo.model.challenge

import com.google.gson.annotations.SerializedName

data class ChallengeBody(
	@field:SerializedName("title")
	val title: String,
	
	@field:SerializedName("description")
	val description: String,
	
	@field:SerializedName("xp_earned")
	val xpEarned: Int,
)
