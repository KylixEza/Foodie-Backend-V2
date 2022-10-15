package com.oreyo.route.note

import com.oreyo.route.user.UserRouteLocation.Companion.SELECTED_USER
import io.ktor.server.locations.*

@KtorExperimentalLocationsAPI
sealed class NoteRouteLocation {
	companion object {
		//GET
		const val CALORIES_PREDICTION = "/calories/predict/{food}"
		//POST
		const val ADD_NOTE = "$SELECTED_USER/note"
		//GET
		const val GET_NOTE = "$SELECTED_USER/note"
	}
	
	@Location(CALORIES_PREDICTION)
	data class CaloriesPredictionPostRoute(val food: String)
	
	@Location(ADD_NOTE)
	data class NotePostRoute(val uid: String)
	
	@Location(GET_NOTE)
	data class NoteGetListRoute(val uid: String)
}
