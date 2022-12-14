package com.oreyo.model.user

import com.google.gson.annotations.SerializedName

data class UserBody(
	@field:SerializedName("uid")
	val uid: String,
	
	@field:SerializedName("address")
	val address: String,
	
	@field:SerializedName("avatar")
	val avatar: String,
	
	@field:SerializedName("foodie_wallet")
	val foodieWallet: Int,
	
	@field:SerializedName("email")
	val email: String,
	
	@field:SerializedName("name")
	val name: String,
	
	@field:SerializedName("phone_number")
	val phoneNumber: String,
	
	@field:SerializedName("xp")
	val xp: Int
)
