package com.oreyo.model.note

import com.google.gson.annotations.SerializedName

data class PredictionResponse(
	
	@field:SerializedName("food")
	val food: String,
	
	@field:SerializedName("calories")
	val calories: Int,
	
	@field:SerializedName("accuracy")
	val accuracy: Double
)
