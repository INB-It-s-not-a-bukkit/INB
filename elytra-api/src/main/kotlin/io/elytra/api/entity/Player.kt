package io.elytra.api.entity

import com.mojang.authlib.GameProfile
import io.elytra.api.world.enums.GameMode
import io.elytra.api.world.Position
import java.util.*

interface Player {
	var displayName: String
	var gameProfile: GameProfile?

	var premium: Boolean
	var online: Boolean
	var banned: Boolean

	var exp: Int
	var expLevel: Int

	var position: Position
	var gamemode: GameMode
}
