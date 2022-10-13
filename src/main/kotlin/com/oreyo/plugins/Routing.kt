package com.oreyo.plugins

import com.oreyo.route.challenge.ChallengeRoute
import com.oreyo.route.menu.MenuRoute
import com.oreyo.route.note.NoteRoute
import com.oreyo.route.user.UserRoute
import com.oreyo.route.voucher.VoucherRoute
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

@KtorExperimentalLocationsAPI
fun Application.configureRouting() {

    val challengeRoute by inject<ChallengeRoute>()
    val menuRoute by inject<MenuRoute>()
    val noteRoute by inject<NoteRoute>()
    val userRoute by inject<UserRoute>()
    val voucherRoute by inject<VoucherRoute>()
    
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        
        get("/leaderboards") {
            call.respondText("Hello from leaderboard")
        }
        
        challengeRoute.initChallengeRoute(this)
        menuRoute.initMenuRoute(this)
        noteRoute.initNoteRoute(this)
        userRoute.initUserRoute(this)
        voucherRoute.initVoucherRoute(this)
    }
}
