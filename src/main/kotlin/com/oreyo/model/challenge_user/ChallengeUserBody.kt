package com.oreyo.model.challenge_user

import com.google.gson.annotations.SerializedName

data class ChallengeUserBody(
	@field:SerializedName("uid")
	val uid: String
)
