package com.oreyo.model.user

import com.google.gson.annotations.SerializedName

data class EditProfileBody(
	
	@field:SerializedName("avatar")
	val avatar: String,
	
	@field:SerializedName("name")
	val name: String,
	
	@field:SerializedName("phone_number")
	val phoneNumber: String
)
