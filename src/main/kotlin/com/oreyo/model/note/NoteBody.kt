package com.oreyo.model.note

import com.google.gson.annotations.SerializedName

data class NoteBody (
	
	@field:SerializedName("uid")
	val uid: String,
	
	@field:SerializedName("category")
	val category: String,
	
	@field:SerializedName("date")
	val date: String,
	
	@field:SerializedName("food")
	val food: String,
	
	@field:SerializedName("information")
	val information: String,
	
	@field:SerializedName("portion")
	val portion: Double
)