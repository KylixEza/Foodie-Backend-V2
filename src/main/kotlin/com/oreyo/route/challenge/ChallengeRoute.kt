package com.oreyo.route.challenge

import com.oreyo.data.IFoodieRepository
import com.oreyo.model.challenge.ChallengeBody
import com.oreyo.model.challenge.ChallengeMenuBody
import com.oreyo.model.challenge_user.ChallengeUserBody
import com.oreyo.route.RouteResponseHelper.generalException
import com.oreyo.route.RouteResponseHelper.generalListSuccess
import com.oreyo.route.RouteResponseHelper.generalSuccess
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.locations.post
import io.ktor.server.request.*
import io.ktor.server.routing.*

@KtorExperimentalLocationsAPI
class ChallengeRoute(
	private val repository: IFoodieRepository
) {
	
	private fun Route.getAllAvailableChallenge() {
		get<ChallengeRouteLocation.ChallengeGetAvailableListRoute> {
			
			val body = try {
				call.receive<ChallengeUserBody>()
			} catch (e: Exception) {
				call.generalException(e)
				return@get
			}
			
			call.generalListSuccess { repository.getAllAvailableChallenge(body) }
		}
	}
	
	private fun Route.postChallenge() {
		post<ChallengeRouteLocation.ChallengePostRoute> {
			val body = try {
				call.receive<ChallengeBody>()
			} catch (e: Exception) {
				call.generalException(e)
				return@post
			}
			call.generalSuccess { repository.addNewChallenge(body) }
		}
	}
	
	private fun Route.joinChallenge() {
		post<ChallengeRouteLocation.ChallengeJoinRoute> {
			val challengeId = try {
				call.parameters["challengeId"]
			} catch (e: Exception) {
				call.generalException(e)
				return@post
			}
			
			val body = try {
				call.receive<ChallengeUserBody>()
			} catch (e: Exception) {
				call.generalException(e)
				return@post
			}
			
			call.generalSuccess { repository.joinChallenge(challengeId!!, body) }
		}
	}
	
	private fun Route.postChallengeMenu() {
		post<ChallengeRouteLocation.ChallengeMenuPostRoute> {
			val body = try {
				call.receive<ChallengeMenuBody>()
			} catch (e: Exception) {
				call.generalException(e)
				return@post
			}
			call.generalSuccess { repository.addNewChallengeMenu(body) }
		}
	}
	
	private fun Route.getDetailChallenge() {
		get<ChallengeRouteLocation.ChallengeDetailRoute> {
			val challengeId = try {
				call.parameters["challengeId"]
			} catch (e: Exception) {
				call.generalException(e)
				return@get
			}
			call.generalListSuccess { repository.getDetailChallenge(challengeId!!)}
		}
	}
	
	fun initChallengeRoute(route: Route) {
		route.apply {
			getAllAvailableChallenge()
			postChallenge()
			joinChallenge()
			postChallengeMenu()
			getDetailChallenge()
		}
	}
	
}