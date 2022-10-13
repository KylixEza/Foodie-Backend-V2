package com.oreyo.route.challenge

import io.ktor.server.locations.*

@KtorExperimentalLocationsAPI
sealed class ChallengeRouteLocation {
	companion object {
		//GET
		const val CHALLENGE = "/challenge"
		//POST
		const val POST_CHALLENGE = "/challenge"
		//POST
		const val JOIN_CHALLENGE = "/challenge/{challengeId}/join"
		//POST
		const val POST_CHALLENGE_MENU = "/challenge/menu"
		//GET
		const val GET_DETAIL_CHALLENGE = "/challenge/{challengeId}"
	}
	
	@Location(CHALLENGE)
	class ChallengeGetAvailableListRoute
	
	@Location(POST_CHALLENGE)
	class ChallengePostRoute
	
	@Location(JOIN_CHALLENGE)
	data class ChallengeJoinRoute(val challengeId: String)
	
	@Location(POST_CHALLENGE_MENU)
	class ChallengeMenuPostRoute
	
	@Location(GET_DETAIL_CHALLENGE)
	data class ChallengeDetailRoute(val challengeId: String)
}
