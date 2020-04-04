package io.elytra.api.command

import io.elytra.api.command.argument.Argument
import io.elytra.api.command.argument.ArgumentContext
import io.elytra.api.entity.Player

interface Command {

	val name: String

	fun execute(player: Player, contextArguments: MutableList<Argument<*>>)

	val arguments: List<ArgumentContext<Any>>

}
