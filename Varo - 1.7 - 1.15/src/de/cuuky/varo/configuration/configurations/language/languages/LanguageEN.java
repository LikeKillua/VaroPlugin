package de.cuuky.varo.configuration.configurations.language.languages;

import de.cuuky.cfw.configuration.language.languages.LoadableMessage;

public enum LanguageEN implements LoadableMessage {

	ALERT_AUTOSTART_AT("alerts.BOTS_ALERT.autostartAt", "%projectname% will start on %date%!"),
	ALERT_BORDER_CHANGED("alerts.BOTS_ALERT.borderChanged", "The border was set to %size%!"),
	ALERT_BORDER_DECREASED_DEATH("alerts.BOTS_ALERT.borderDecrease.death", "The border was decreased by %size% due to a death!"),
	ALERT_BORDER_DECREASED_TIME_DAYS("alerts.BOTS_ALERT.borderDecrease.days", "The border was decreased by %size%. Next decrease in %days% days!"),
	ALERT_BORDER_DECREASED_TIME_MINUTE("alerts.BOTS_ALERT.borderDecrease.minutes", "The border was decreased by %size%. Next decrease in %minutes% minutes!"),
	ALERT_COMBAT_LOG("alerts.BOTS_ALERT.combatlog", "%player% has logged out during a battle!"),
	ALERT_COMBAT_LOG_STRIKE("alerts.BOTS_ALERT.combatlogStrike", "%player% has logged out during the battle and therefore got a strike!"),
	ALERT_DISCONNECT_TOO_OFTEN("alerts.BOTS_ALERT.disconnectTooOften", "%player% left the game too often, so their session was removed!"),
	ALERT_DISCORD_DEATH("alerts.BOTS_ALERT.death", "%player% has died! Reason: %reason%"),
	ALERT_DISCORD_KILL("alerts.BOTS_ALERT.kill", "%player% was killed by %killer%!"),
	ALERT_FIRST_STRIKE("alerts.BOTS_ALERT.firstStrike", "%player% now has a strike. The strike was given by %striker%. Reason: %reason%\nBecause of this, here are the current coordinates: %pos%!"),
	ALERT_FIRST_STRIKE_NEVER_ONLINE("alerts.BOTS_ALERT.firstStrikeNeverOnline", "%player% now has a strike. The strike was given by %striker%. Reason: %reason%\nThe player was not online yet and will spawn at the spawn coordinates: %pos%!"),
	ALERT_GAME_STARTED("alerts.BOTS_ALERT.gameStarted", "%projectname% has started!"),
	ALERT_GENERAL_STRIKE("alerts.BOTS_ALERT.generalStrike", "%player% now has %strikeNumber% strikes! The strike was given by %striker%. Reason: %reason%"),
	ALERT_JOIN_FINALE("alerts.BOTS_ALERT.finale", "%player% &7has entered the server to participate in the final"),
	ALERT_KICKED_PLAYER("alerts.BOTS_ALERT.kickedPlayer", "%player% has been kicked!"),
	ALERT_SESSIONS_ENDED("alerts.BOTS_ALERT.sessionsEnded", "Due to end of a day, %player%'s session has been endet!"),
	ALERT_NEW_SESSIONS("alerts.BOTS_ALERT.newSessions", "There were %newSessions% new sessions given to the players!"),
	ALERT_NEW_SESSIONS_FOR_ALL("alerts.BOTS_ALERT.newSessionsForAll", "Everybody got %newSessions% new sessions!"),
	ALERT_NO_BLOODLUST("alerts.BOTS_ALERT.noBloodlust", "%player% has now not fought for %days% days, which has exceeded the limit!"),
	ALERT_NO_BLOODLUST_STRIKE("alerts.BOTS_ALERT.noBloodlustStrike", "%player% has not fought for %days% days now, so %player% is now striked!"),
	ALERT_NOT_JOIN("alerts.BOTS_ALERT.notJoin", "%player% was not online for %days% days now, which exceeded the limit!"),
	ALERT_NOT_JOIN_STRIKE("alerts.BOTS_ALERT.notJoinStrike", "%player% was not online for %days% days, so %player% is now striked!"),
	ALERT_PLAYER_DC_TO_EARLY("alerts.BOTS_ALERT.playerQuitToEarly", "%player% has left the game early! %player% still has %seconds% seconds of play time left!"),
	ALERT_PLAYER_JOIN_MASSREC("alerts.BOTS_ALERT.playerJoinMassrec", "%player% has entered the server in mass recording and is now playing the %episodesPlayedPlus1%th session."),
	ALERT_PLAYER_JOIN_NORMAL("alerts.BOTS_ALERT.playerJoinNormal", "%player% has joined the game!"),
	ALERT_PLAYER_JOINED("alerts.BOTS_ALERT.playerJoined", "%player% has entered the server and is now playing the %episodesPlayedPlus1%th session!"),
	ALERT_PLAYER_QUIT("alerts.BOTS_ALERT.playerQuit", "%player% has left the game!"),
	ALERT_PLAYER_RECONNECT("alerts.BOTS_ALERT.playerReconnect", "%player% left the game early and rejoined! %player% has %seconds% seconds left!"),
	ALERT_SECOND_STRIKE("alerts.BOTS_ALERT.secondStrike", "%player% now has two strikes. The strike was given by %striker%. Reason: %reason%\nBecause of this the inventory was emptied!"),
	ALERT_SWITCHED_NAME("alerts.BOTS_ALERT.switchedName", "%player% has changed their name and is now known as %newName%!"),
	ALERT_TELEPORTED_TO_MIDDLE("alerts.BOTS_ALERT.teleportedToMiddle", "%player% was teleported to the center!"),
	ALERT_THRID_STRIKE("alerts.BOTS_ALERT.thirdStrike", "%player% now has three strikes. The strike was given by %striker%. Reason: %reason%\nThis means that %player% has been removed from %projectname%!"),
	ALERT_WINNER("alerts.BOTS_ALERT.win.player", "%player% has won %projectname%! Congratulations!"),
	ALERT_WINNER_TEAM("alerts.BOTS_ALERT.win.team", "%winnerPlayers% have won %projectname%! Congratulations!"),

	BORDER_MINIMUM_REACHED("border.minimumReached", "&cThe Border has reached its minimum!"),
	BORDER_DECREASE_DAYS("border.decreaseDays", "&7The border is now reduced by &c%size% &7blocks with &c%speed% &7blocks/s. &7Next reduction in &c%days% &7days!"),
	BORDER_DECREASE_DEATH("border.decreaseDeath", "&7The border is now reduced by &c%size% &7blocks with &c%speed% &7blocks/s due to a death."),
	BORDER_MINUTE_TIME_UPDATE("border.minuteTimeUpdate", "&7The border is reduced in &c%minutes%&7:&c%seconds%"),
	BORDER_DECREASE_MINUTES("border.decreaseMinutes", "&7The border is now reduced by &c%size% &7blocks with &c%speed% &7blocks/s. &7Next reduction in &c%days% &7minutes!"),
	BORDER_DISTANCE("border.distanceToBorder", "&7Distance to border: %colorcode%%size% &7blocks"),
	BORDER_COMMAND_SET_BORDER("border.borderSet", "&7The border was set to %colorcode%%size% &7!"),

	BOTS_DISCORD_NOT_REGISTERED_DISCORD("bots.notRegisteredDiscord", "&cYou are not yet authenticated with the discord!\n&7To authenticate yourself, write in the #verify channel &c'varo verify <Your ID>' &7on the discord!\nLink to the Discordserver: &c%discordLink%\n&7Your ID is: &c%code%"),
	BOTS_DISCORD_NO_SERVER_USER("bots.noServerUser", "&cYour account is not on the discord!%nextLine%&7Join the discord and try again."),

	CHAT_PLAYER_WITH_TEAM("chat.format.withTeam", "%colorcode%%team% &8| &7%player% &8» &f%message%"),
	CHAT_PLAYER_WITH_TEAM_RANK("chat.format.withTeamAndRank", "&7%rank% &8| %colorcode%%team% &8| &7%player% &8» &f%message%"),
	CHAT_PLAYER_WITHOUT_TEAM("chat.format.withoutTeam", "&7%player% &8» &f%message%"),
	CHAT_PLAYER_WITHOUT_TEAM_RANK("chat.format.withoutTeamWithRank", "&7%rank% &8| &7%player% &8» &f%message%"),

	CHAT_TEAMCHAT_FORMAT("chat.teamchatFormat", "&7[%team%&7] %player% &8» &f%message%"),
	CHAT_MUTED("chat.muted", "&7You have been muted!"),
	CHAT_WHEN_START("chat.chatOnStart", "&7You can only write again after the start!"),

	CHEST_NOT_TEAM_CHEST("chest.notTeamChest", "&7This chest belongs to %colorcode%%player%&7!"),
	CHEST_NOT_TEAM_FURNACE("chest.notTeamFurnace", "&7This furnace belongs to %colorcode%%player%&7!"),
	CHEST_REMOVED_SAVEABLE("chest.removedChest", "&7You have removed this %saveable% %colorcode%successfully"),
	CHEST_SAVED_CHEST("chest.newChestSaved", "&7A new chest was secured!"),
	CHEST_SAVED_FURNACE("chest.newFurnaceSaved", "&7A new furnace was secured!"),

	COMBAT_FRIENDLY_FIRE("combat.friendlyfire", "&7This player is on your team!"),
	COMBAT_IN_FIGHT("combat.inFight", "&7You are now in combat, do &4NOT &7log &7out!"),
	COMBAT_LOGGED_OUT("combat.loggedOut", "&c%player% &7has left the server during a fight!"),
	COMBAT_NOT_IN_FIGHT("combat.notInFight", "&7You are now no longer in a &cfight&7!"),

	DEATH_DEAD("death.killMessage", "&c%player% &7has died. &7Reason: &c%reason%"),
	DEATH_KILLED_BY("death.killed", "%colorcode%%player% &7was killed by &c%killer% &7!"),
	DEATH_LIFE_LOST("death.teamLifeLost", "%player% now still has %colorcode%%teamLifes% &7team lives left!"),
	DEATH_RESPAWN_PROTECTION("death.respawnProtection", "&c%player% now has one life less and is invulnerable for %seconds% seconds!"),
	DEATH_RESPAWN_PROTECTION_OVER("death.respawnProtectionOver", "&c%player% is now vulnerable again!"),
	DEATH_KILL_LIFE_ADD("death.killLifeAdd", "&7Your team got a team life because of a kill!"),

	GAME_START_COUNTDOWN("game.start.startCountdown", "%projectname% &7starts in %colorcode%%countdown% &7second(s)!"),
	GAME_VARO_START("game.start.varoStart", "%projectname% &7was started! &5Good luck!"),
	GAME_VARO_START_TITLE("game.start.startTitle", "%colorcode%%countdown%\n&7Good luck!"),
	GAME_WIN("game.win.single", "&5%player% &7has won %projectname%&7! &5Congratulations!"),
	GAME_WIN_TEAM("game.win.team", "&5%winnerPlayers% &7 have won %projectname% &7! &5Congratulations!"),

	JOIN_MESSAGE("joinmessage.join", "%prefix%&a%player% &7has entered the server!"),
	JOIN_FINALE("joinmessage.finale", "%prefix%&a%player% &7has entered the server for the final."),
	JOIN_MASS_RECORDING("joinmessage.massrecording", "%prefix%&a%player% &7has entered the server in mass recording and is vulnerable in %colorcode%%protectionTime% &7seconds!"),
	JOIN_NO_MOVE_IN_PROTECTION("joinmessage.notMoveinProtection", "&7You cannot move while you still are in the %colorcode%protection time&7!"),
	JOIN_PROTECTION_OVER("joinmessage.joinProtectionOver", "%prefix%&a%player% &7is now vulnerable!"),
	JOIN_PROTECTION_TIME("joinmessage.joinProtectionTime", "%prefix%&a%player% &7has entered the server and is vulnerable in %colorcode%%protectionTime% &7seconds!"),
	JOIN_SPECTATOR("joinmessage.spectator", "&a%player% &7has entered the server as a spectator!"),
	JOIN_WITH_REMAINING_TIME("joinmessage.joinWithRemainingTime", "%prefix%&a%player% &7had left the server too early and now has %colorcode%%seconds% &7seconds left! Remaining &cDisconnects&7: &c%remainingDisconnects%"),

	DEATH_KICK_DEAD("kick.kickedKilled", "&You died! %nextLine% &7With this you are removed from %projectname%"),
	DEATH_KICK_KILLED("kick.killedKick", "&7You were killed by &c%killer% &7! %nextLine% &7You have been removed from %projectname%&7!"),
	JOIN_KICK_NOT_USER_OF_PROJECT("kick.notUserOfTheProject", "&7You are not a participant of this %projectname%&7!"),
	JOIN_KICK_SERVER_FULL("kick.serverFull", "&cThe server is full!%nextLine%&7Talk to the owner if this is a mistake!"),
	JOIN_KICK_STRIKE_BAN("kick.strikeBan", "&cYou were banned for %hours% hours because of your last strike!\nTry again later."),
	JOIN_KICK_BANNED("kick.banned", "&4You are banned from the server!\n&7Report to an admin if this is an error.\n&7Reason: &c%reason%"),
	JOIN_KICK_NO_PREPRODUCES_LEFT("kick.noPreproduceLeft", "&cYou already have pre-produced! %nextLine%&7Try again tomorrow."),
	JOIN_KICK_NO_SESSIONS_LEFT("kick.noSessionLeft", "&cYou have no more sessions left! %nextLine%&7Wait until tomorrow so you can play again!"),
	JOIN_KICK_NO_TIME_LEFT("kick.noTimeLeft", "You are only allowed to play all &4%timeHours% &chours regularly! %nextLine%&7You can only join in &c%stunden%&7:&c%minuten%&7:&c%sekunden% &7join again!"),
	JOIN_KICK_NOT_STARTED("kick.notStarted", "&cThe server has not been opened yet! %nextLine%&7Please be patient a little longer!"),
	KICK_SESSION_OVER("kick.kickMessage", "&cYour recording time has expired, %nextLine%&7this is why you got kicked!"),
	KICK_MASS_REC_SESSION_OVER("kick.kickMessageMassRec", "&cThe mass recording is finished, %nextLine%&7that's why you got kicked!"),
	KICK_TOO_MANY_STRIKES("kick.tooManyStrikes", "&7You got too many strikes and were therefore removed from the project %projectname%"),
	KICK_COMMAND("kick.kick", "%colorcode%%player% &7was kicked!"),

	LABYMOD_DISABLED("labymod.labyModDisabled", "&7All your LabyMod functions have been deactivated!"),
	LABYMOD_KICK("labymod.labyMod", "&cLabyMod isn't allowed on this server."),

	SERVER_MODT_CANT_JOIN_GLOBAL("motd.cantJoinGlobal", "&cYou can only join between &4%minHour%:%minMinute% &cand &4%maxHour%:%maxMinute%&c! %nextLine%&cThat's &4%minPlayerHour%:%minPlayerMinute% &c- &4%maxPlayerHour%:%maxPlayerMinute%&c in your time zone! %nextLine%&7Please try again later! &7%currPlayerHour%&7:&7%currPlayerMin%&7:&7%currPlayerSec%"),
	SERVER_MODT_CANT_JOIN_PLAYER("motd.cantJoinPlayer", "&cYou can only join between &4%minHour%:%minMinute% &cand &4%maxHour%:%maxMinute%&c! %nextLine%&7Please try again later! &7%currPlayerHour%&7:&7%currPlayerMin%&7:&7%currPlayerSec%"),
	SERVER_MODT_NOT_OPENED("motd.serverNotOpened", "&cThe server has not yet been opened for everyone! %nextLine%&7Try again later!"),
	SERVER_MODT_OPEN("motd.serverOpen", "&aBe now with us in %projectname%&a!\n&7Have fun!"),

	NAMETAG_NORMAL("nametag.normalNametagPrefix", "&7"),
	NAMETAG_SUFFIX("nametag.normalSuffix", "&c %kills%"),
	NAMETAG_TEAM_PREFIX("nametag.nametagWithTeam", "%colorcode%%team% &7"),

	NOPERMISSION_NO_PERMISSION("nopermission.noPermission", "%colorcode%You are not authorized for this!"),
	NOPERMISSION_NOT_ALLOWED_CRAFT("nopermission.notAllowedCraft", "&7You may not craft, use or brew that!"),
	NOPERMISSION_NO_LOWER_FLIGHT("nopermission.noLowerFlight", "&7You can not fly lower!"),

	OTHER_CONFIG("other.configReload", "&7The %colorcode%Config &7was reloaded"),
	OTHER_PING("other.ping", "&7Your %colorcode%Ping &7 is: %colorcode%%ping%&7ms"),

	PROTECTION_NO_MOVE_START("protection.noMoveStart", "&7You cannot move until the project has been started."),
	PROTECTION_START("protection.start", "&7The &cProtection time &7starts now and will stop in &c%seconds% &7seconds!"),
	PROTECTION_TIME_OVER("protection.protectionOver", "&7The &cprotection time &7is now over!"),
	PROTECTION_TIME_UPDATE("protection.protectionUpdate", "&7The &cprotection time &7is over in &c%minutes%&7:&c%seconds% &7!"),
	PROTECTION_TIME_RUNNING("protection.timeRunning", "&7The %colorcode%protection time &7 is still running!"),

	QUIT_MESSAGE("quitmessage.quit", "%prefix%&c%player%&7 has left the server!"),
	QUIT_DISCONNECT_SESSION_END("quitmessage.disconnectKilled", "&c%player% &7has left the game and is no longer online since &c%banTime% &7minute(s).%nextLine%&7This means he has been removed from %projectname% &7!"),
	QUIT_SPECTATOR("quitmessage.spectator", "&c%player% &7has left the server as a spectator!"),
	QUIT_TOO_OFTEN("quitmessage.quitTooOften", "&c%player% &7has left the server too often and thus lost their session."),
	QUIT_WITH_REMAINING_TIME("quitmessage.quitRemainingTime", "%prefix%&c%player% &7has left the server early!"),
	QUIT_KICK_BROADCAST("quitmessage.broadcast", "%colorcode%%player% &7has been kicked!"),
	QUIT_KICK_DELAY_OVER("quitmessage.protectionOver", "%colorcode%%player% &7was kicked because of their death now!"),
	QUIT_KICK_IN_SECONDS("quitmessage.kickInSeconds", "%colorcode%%player% &7will be kicked in %colorcode%%countdown% &7second(s)!"),
	QUIT_KICK_PLAYER_NEARBY("quitmessage.noKickPlayerNearby", "&cThere is a player &4%distance% &cblocks near you!%nextLine%&7To get kicked, move away from this player!"),
	QUIT_KICK_SERVER_CLOSE_SOON_GLOBAL("quitmessage.serverCloseSoonGlobal", "&7The server closes in &c%minutes% &7minutes!"),
	QUIT_KICK_SERVER_CLOSE_SOON_PLAYER("quitmessage.serverCloseSoonLocal", "&7The server closes in &c%minutes% &7minutes for you!"),

	SORT_NO_HOLE_FOUND("sort.noHoleFound", "&7No hole could be found for you!"),
	SORT_NO_HOLE_FOUND_TEAM("sort.noHoleFoundTeam", "&7No hole could be found for you beside your team partners."),
	SORT_NUMBER_HOLE("sort.numberHoleTeleport", "&7You have been teleported to the hole %colorcode%%number% &7!"),
	SORT_OWN_HOLE("sort.ownHoleTeleport", "&7You've been put in your hole!"),
	SORT_SPECTATOR_TELEPORT("sort.spectatorTeleport", "&7You were teleported to spawn because you're a spectator!"),
	SORT_SORTED("sort.sorted", "&7You have been teleported to the hole %colorcode%%number% &7!"),

	SPAWN_WORLD("spawn.spawn", "%colorcode%Coordinates&7 of the spawn: %colorcode%%x%&7, %colorcode%%y%&7, %colorcode%%z%"),
	SPAWN_NETHER("spawn.spawnNether", "%colorcode%Coordinates&7 of the portal to the world: %colorcode%%x%&7, %colorcode%%y%&7, %colorcode%%z%"),
	SPAWN_DISTANCE("spawn.spawnDistance", "&7You are %colorcode%%distance% &7blocks away from spawn!"),
	SPAWN_DISTANCE_NETHER("spawn.spawnDistanceNether", "&7You are %colorcode%%distance% &7blocks away from the portal to the world!"),
	SPAWNS_SPAWN_NUMBER("spawns.spawnNameTag.number", "&7Spawn %colorcode%%number%"),
	SPAWNS_SPAWN_PLAYER("spawns.spawnNameTag.player", "&7Spawn of %colorcode%%player%"),

	TABLIST_PLAYER_WITH_TEAM("tablist.player.withTeam", "%colorcode%%team% &8| &7%player%  &c%kills%"),
	TABLIST_PLAYER_WITH_TEAM_RANK("tablist.player.withTeamAndRank", "&7%rank% &8| %colorcode%%team% &8| &7%player%  &c%kills%"),
	TABLIST_PLAYER_WITHOUT_TEAM("tablist.player.withoutTeam", "&7%player%  &c%kills%"),
	TABLIST_PLAYER_WITHOUT_TEAM_RANK("tablist.player.withoutTeamWithRank", "&7%rank% &8| &7%player%  &c%kills%"),

	TEAMREQUEST_ENTER_TEAMNAME("teamrequest.enterTeamName", "%colorcode%&lType the team name for you and %invited%:"),
	TEAMREQUEST_MAX_TEAMNAME_LENGTH("teamrequest.maxTeamnameLength", "&7Your team name must not contain more than %colorcode%%maxLength% &7characters!"),
	TEAMREQUEST_NO_COLORCODE("teamrequest.noColorCode", "&7Your team name must not contain color codes!"),
	TEAMREQUEST_NO_HASHTAG("teamrequest.noHashtag", "&7Your team name must not contain a '#'. (Will be added automatically)"),
	TEAMREQUEST_PLAYER_NOT_ONLINE("teamrequest.playerNotOnline", "%colorcode%%invitor% is no longer online!"),
	TEAMREQUEST_REVOKED("teamrequest.invationRevoked", "Invitation successfully withdrawn!"),
	TEAMREQUEST_TEAM_FULL("teamrequest.teamIsFull", "%invited% wasn't able to join your team - team member limit reached."),
	TEAMREQUEST_TEAM_REQUEST_RECIEVED("teamrequest.teamRequestRecieved", "%colorcode%%invitor% &7has invited you to join a team (/varo tr)!"),
	TEAMREQUEST_INVITED_TEAM("teamrequest.invitedInTeam", "&7You have invited %colorcode%%invited% &7 in the team %colorcode%%team% &7!"),
	TEAMREQUEST_NO_TEAMNAME("teamrequest.noteamname", "&7You still have no team name!"),

	VARO_COMMANDS_HELP_HEADER("varoCommands.help.header", "&7-------- %colorcode% %category% &7-------"),
	VARO_COMMANDS_HELP_FOOTER("varoCommands.help.footer", "&7------------------------"),
	VARO_COMMANDS_ERROR_USER_NOT_FOUND("varoCommands.error.usernotfound", "&7No user could be found for this player!"),
	VARO_COMMANDS_ERROR_UNKNOWN_PLAYER("varoCommands.error.unknownplayer", "&7The player %colorcode%%player% &7has never entered the server before!"),
	VARO_COMMANDS_ERROR_NO_CONSOLE("varoCommands.error.noconsole", "You must be a player!"),
	VARO_COMMANDS_ERROR_NOT_STARTED("varoCommands.error.notstarted", "The games have not started yet!"),
	VARO_COMMANDS_ERROR_USAGE("varoCommands.error.usage", "&cError! &7Use %colorcode%/varo %command% &7for help."),
	VARO_COMMANDS_ERROR_NO_NUMBER("varoCommands.error.nonumber", "%colorcode%%text% &7is not a number!"),
	VARO_COMMANDS_ERROR("varoCommands.error.error", "&7An error has occurred!"),
	VARO_COMMANDS_BUGREPORT_CREATED("varoCommands.bugreport.created", "Bugreport was saved under &c%filename% &7!"),
	VARO_COMMANDS_BUGREPORT_SEND_TO_DISCORD("varoCommands.bugreport.sendtodiscord", "Please send the bug report as FILE manually to the discord in the support, because the upload did not work!"),
	VARO_COMMANDS_BUGREPORT_OUTDATED_VERSION("varoCommands.bugreport.outdatedversion", "You cannot make bug reports from an old plugin version!"),
	VARO_COMMANDS_BUGREPORT_CURRENT_VERSION("varoCommands.bugreport.currentversion", "Current version: &c%version%"),
	VARO_COMMANDS_BUGREPORT_NEWEST_VERSION("varoCommands.bugreport.newestversion", "Latest version: &a%version%"),
	VARO_COMMANDS_BUGREPORT_UPDATE("varoCommands.bugreport.update", "&7Use %colorcode%/varo update &7to update."),
	VARO_COMMANDS_BUGREPORT_COLLECTING_DATA("varoCommands.bugreport.collectingdata", "Data is being collected..."),
	VARO_COMMANDS_BUGREPORT_UPLOADING("varoCommands.bugreport.uploading", "Uploading bug report..."),
	VARO_COMMANDS_BUGREPORT_UPLOAD_ERROR("varoCommands.bugreport.uploaderror", "The bug report could not be uploaded!"),
	VARO_COMMANDS_BUGREPORT_UPLOADED("varoCommands.bugreport.uploaded", "Bugreport has been uploaded to &c%url% &7!"),
	VARO_COMMANDS_BUGREPORT_CLICK_ME("varoCommands.bugreport.clickme", " &7(&aClick me&7)"),
	VARO_COMMANDS_ABORT_COUNTDOWN_NOT_ACTIVE("varoCommands.abort.notactive", "The start countdown is not active!"),
	VARO_COMMANDS_ABORT_COUNTDOWN_STOPPED("varoCommands.abort.stopped", "Start countdown successfully stopped!"),
	VARO_COMMANDS_ACTIONBAR_ACTIVATED("varoCommands.actionbar.activated", "You can now see the time in the action bar!"),
	VARO_COMMANDS_ACTIONBAR_DEACTIVATED("varoCommands.actionbar.deactivated", "You can no longer see the time in the action bar!"),
	VARO_COMMANDS_AUTOSETUP_NOT_SETUP_YET("varoCommands.autostart.notsetupyet", "The AutoSetup has not yet been set up in the Config!"),
	VARO_COMMANDS_AUTOSETUP_FINISHED("varoCommands.autostart.finished", "The AutoSetup is finished."),
	VARO_COMMANDS_AUTOSETUP_HELP("varoCommands.autostart.help", "%colorcode%/varo autosetup run &7starts the autosetup"),
	VARO_COMMANDS_AUTOSETUP_ATTENTION("varoCommands.autostart.attention", "&cCaution: &7This command sets new spawns, lobby, portal, border and &loptional&7 an autostart"),
	VARO_COMMANDS_AUTOSTART_ALREADY_STARTED("varoCommands.autostart.alreadystarted", "%projectname% &7has already been started!"),
	VARO_COMMANDS_AUTOSTART_ALREADY_SETUP("varoCommands.autostart.alreadysetup", "&7Remove the AutoStart first before you set a new one!"),
	VARO_COMMANDS_AUTOSTART_HELP_SET("varoCommands.autostart.helpset", "%colorcode%/autostart &7set <Hour> <Minute> <Day> <Month> <Year>"),
	VARO_COMMANDS_AUTOSTART_NO_NUMBER("varoCommands.autostart.nonumber", "One or more arguments are &cnot &7a number!"),
	VARO_COMMANDS_AUTOSTART_DATE_IN_THE_PAST("varoCommands.autostart.dateinthepast", "&7The %colorcode%date &7must not be in the past!"),
	VARO_COMMANDS_AUTOSTART_REMOVED("varoCommands.autostart.removed", "%colorcode%AutoStart &7 successfully removed!"),
	VARO_COMMANDS_AUTOSTART_NOT_SETUP_YET("varoCommands.autostart.notsetupyet", "&7There is no %colorcode%autostart &7defined yet!"),
	VARO_COMMANDS_AUTOSTART_DELAY_HELP("varoCommands.autostart.delayhelp", "%colorcode%/autostart delay &7<Delay in Minutes>"),
	VARO_COMMANDS_AUTOSTART_DELAY_TO_SMALL("varoCommands.autostart.delaytosmall", "The delay must not be less than 1!"),
	VARO_COMMANDS_AUTOSTART_START_DELAYED("varoCommands.autostart.startdelayed", "&7The start has been delayed by %colorcode%%delay% &7minutes!"),
	VARO_COMMANDS_AUTOSTART_INFO_NOT_ACTIVE("varoCommands.autostart.notactive", "AutoStart not inactive"),
	VARO_COMMANDS_AUTOSTART_INFO_ACTIVE("varoCommands.autostart.active", "AutoStart &aactive&7:"),
	VARO_COMMANDS_AUTOSTART_INFO_DATE("varoCommands.autostart.info.date", "%colorcode%Date: &7%date%"),
	VARO_COMMANDS_AUTOSTART_INFO_AUTOSORT("varoCommands.autostart.info.autosort", "%colorcode%AutoSort: &7%active%"),
	VARO_COMMANDS_AUTOSTART_INFO_RANDOM_TEAM_SIZE("varoCommands.autostart.info.randomteamsize", "%colorcode%Auto random team size: &7%teamsize%"),
	VARO_COMMANDS_BACKPACK_PLAYER_DOESNT_EXIST("varoCommands.backpack.playerdoesntexist", "The player %colorcode%%player% &7does not exist."),
	VARO_COMMANDS_BACKPACK_TEAM_DOESNT_EXIST("varoCommands.backpack.teamdoesntexist", "The team %colorcode%%team% &7does not exist."),
	VARO_COMMANDS_BACKPACK_CANT_SHOW_BACKPACK("varoCommands.backpack.cantshowbackpack", "The backpack can therefore not be shown to you."),
	VARO_COMMANDS_BACKPACK_NO_TEAM("varoCommands.backpack.noteam", "You are not in a team and therefore do not have a team backpack."),
	VARO_COMMANDS_BACKPACK_CHOOSE_TYPE("varoCommands.backpack.choosetype", "Please choose which backpack you want to open %colorcode%(Player/Team)&7."),
	VARO_COMMANDS_BACKPACK_NOT_ENABLED("varoCommands.backpack.notenabled", "The backpacks are not activated."),
	VARO_COMMANDS_CONFIG_RELOADED("varoCommands.config.reloaded", "&7All %colorcode%lists&7, %colorcode%messages, &7and the %colorcode%config &7have been successfully reloaded."),
	VARO_COMMANDS_CONFIG_HELP_SET("varoCommands.config.helpset", "%colorcode%/varo config &7set <key> <value>"),
	VARO_COMMANDS_CONFIG_HELP_SEARCH("varoCommands.config.helpsearch", "%colorcode%/varo config &7search <key>"),
	VARO_COMMANDS_CONFIG_ENTRY_SET("varoCommands.config.entryset", "&7The entry '%colorcode%%entry%&7' was successfully set to '%colorcode%%value%&7."),
	VARO_COMMANDS_CONFIG_ENTRY_NOT_FOUND("varoCommands.config.entrynotfound", "'&7The entry '%colorcode%%entry%&7' was not found."),
	VARO_COMMANDS_CONFIG_RESET("varoCommands.config.reset", "&7All entries have been successfully reset."),
	VARO_COMMANDS_CONFIG_SEARCH_LIST_TITLE("varoCommands.config.searchlisttitle", "&lThe following settings were found:"),
	VARO_COMMANDS_CONFIG_SEARCH_LIST_FORMAT("varoCommands.config.searchlistformat", "%colorcode%%entry% &8- &7%description%"),
	VARO_COMMANDS_EXPORT_SUCCESSFULL("varoCommands.export.players", "&7All players were successfully exported to '%colorcode%%file%&7"),
	VARO_COMMANDS_DISCORD_PLEASE_RELOAD("varoCommands.discord.pleasereload", "&7The DiscordBot was not set up at start, please reload!"),
	VARO_COMMANDS_DISCORD_VERIFY_DISABLED("varoCommands.discord.verifydisabled", "&7The verification system has been deactivated in the Config!"),
	VARO_COMMANDS_DISCORD_BOT_DISABLED("varoCommands.discord.botdisabled", "&7The DiscordBot is disabled!"),
	VARO_COMMANDS_DISCORD_USER_NOT_FOUND("varoCommands.discord.usernotfound", "&7User not found for this player!"),
	VARO_COMMANDS_DISCORD_GETLINK("varoCommands.discord.getlink", "%colorcode%%player%'s account is called %colorcode%%user%&7 and the ID is %colorcode%%id%&7!"),
	VARO_COMMANDS_DISCORD_UNVERIFY("varoCommands.discord.unverify", "&7The account has successfully been unlinked from %colorcode%%player%&7!"),
	VARO_COMMANDS_INTRO_ALREADY_STARTED("varoCommands.intro.alreadystarted", "&7The intro has already been started!"),
	VARO_COMMANDS_INTRO_GAME_ALREADY_STARTED("varoCommands.intro.gamealreadystarted", "&7The game has already been started!"),
	VARO_COMMANDS_INTRO_STARTED("varoCommands.intro.started", "&7And here we go!"),
	VARO_COMMANDS_PRESET_NOT_FOUND("varoCommands.preset.notfound", "The preset %colorcode%%preset% &7was not found."),
	VARO_COMMANDS_PRESET_LOADED("varoCommands.preset.loaded", "The preset %colorcode%%preset% &7was &asuccessfully &7loaded."),
	VARO_COMMANDS_PRESET_SAVED("varoCommands.preset.saved", "The current settings were &asuccessfully &7saved as preset %colorcode%%preset% &7."),
	VARO_COMMANDS_PRESET_LIST("varoCommands.preset.list", "&lList of all presets:"),
	VARO_COMMANDS_PRESET_HELP_LOAD("varoCommands.preset.helploaded", "%colorcode%/varo preset &7load <PresetPath>"),
	VARO_COMMANDS_PRESET_HELP_SAVE("varoCommands.preset.helpsave", "%colorcode%/varo preset &7save <PresetPath>"),
	VARO_COMMANDS_RANDOMTEAM_HELP("varoCommands.randomteam.help", "%colorcode%/varo randomTeam <team size>"),
	VARO_COMMANDS_RANDOMTEAM_TEAMSIZE_TOO_SMALL("varoCommands.randomteam.teamsizetoosmall", "&7The team size must be at least 1."),
	VARO_COMMANDS_RANDOMTEAM_SORTED("varoCommands.randomteam.sorted", "&7All players without a team are now in teams of %colorcode%%teamsize% &7!"),
	VARO_COMMANDS_RANDOMTEAM_NO_PARTNER("varoCommands.randomteam.sorted", "&7Not enough team partners could be found for you."),
	VARO_COMMANDS_RESTART_IN_LOBBY("varoCommands.restart.inlobby", "&7The game is already in the lobby phase!"),
	VARO_COMMANDS_RESTART_RESTARTED("varoCommands.restart.restarted", "&7The games has been restarted."),
	VARO_COMMANDS_SCOREBOARD_DEACTIVATED("varoCommands.scoreboard.deactivated", "&7Scoreboards are disabled."),
	VARO_COMMANDS_SCOREBOARD_ENABLED("varoCommands.scoreboard.enabled", "&7You can now see the scoreboard."),
	VARO_COMMANDS_SCOREBOARD_DISABLED("varoCommands.scoreboard.disabled", "&7You can no longer see the scoreboard."),
	VARO_COMMANDS_SORT_HELP("varoCommands.sort.help", "%colorcode%/varo sort"),
	VARO_COMMANDS_SORT_SORTED_WELL("varoCommands.sort.sorted", "&7All players were successfully sorted."),
	VARO_COMMANDS_SORT_NO_SPAWN_WITH_TEAM("varoCommands.sort.nospawnwithteam", "&7It was not possible to find a hole at the team partners for every player!"),
	VARO_COMMANDS_SORT_NO_SPAWN("varoCommands.sort.nospawn", "&7It was not possible to find a hole for every player!"),

	VARO_COMMANDS_DISCORD_NOT_SETUP("varoCommands.discord.notsetup", "&7The DiscordBot was not set up at the start!"),
	VARO_COMMANDS_DISCORD_STATUS("varoCommands.discord.status", "&7Your discord verification is %status%&7."),
	VARO_COMMANDS_DISCORD_ACTIVE("varoCommands.discord.status.active", "&aactive"),
	VARO_COMMANDS_DISCORD_INACTIVE("varoCommands.discord.status.inactive", "&cinactive"),
	VARO_COMMANDS_DISCORD_NOT_VERIFIED("varoCommands.discord.notverified", "&7You are not verified yet!"),
	VARO_COMMANDS_DISCORD_VERIFICATION_REMOVED("varoCommands.discord.verificationremoved", "&7Your verification was removed."),
	VARO_COMMANDS_DISCORD_VERIFY_SYSTEM_DISABLED("varoCommands.discord.verifysystemdisabled", "&7The Verify system is disabled."),
	VARO_COMMANDS_DISCORD_DISCORDBOT_DISABLED("varoCommands.discord.discordbotdisabled", "&7The Discordbot is disabled."),
	VARO_COMMANDS_DISCORD_RELOADED("varoCommands.discord.reloaded", "&7The Discordbot was &asuccessfully &7reloaded."),
	VARO_COMMANDS_DISCORD_SHUTDOWN("varoCommands.discord.shutdown", "&7The Discordbot was &asuccessfully &7shut down."),
	VARO_COMMANDS_DISCORD_BOT_OFFLINE("varoCommands.discord.botoffline", "&7The Discordbot is not online!"),
	VARO_COMMANDS_DISCORD_NO_EVENT_CHANNEL("varoCommands.discord.noeventchannel", "&7No event channel was given to the bot."),
	VARO_COMMANDS_DISCORD_VERIFY_ENABLED("varoCommands.discord.verifyenabled", "&7The Verify system has been activated."),
	VARO_COMMANDS_DISCORD_DISCORD_MESSAGE_TITLE("varoCommands.discord.discordmessagetitle", "MESSAGE"),
	VARO_COMMANDS_DISCORD_BYPASS_ACTIVE("varoCommands.discord.bypassactive", "&7%player% now bypasses the verification system."),
	VARO_COMMANDS_DISCORD_BYPASS_INACTIVE("varoCommands.discord.bypassinactive", "&7%player% no longer bypasses the verification system."),
	VARO_COMMANDS_DISCORD_VERIFY_ACCOUNT("varoCommands.discord.account", "&7Account: %colorcode%%account%"),
	VARO_COMMANDS_DISCORD_VERIFY_REMOVE_USAGE("varoCommands.discord.account", "&7Use %colorcode%/varo discord verify remove &7to remove the verification.");

	private String path, message;

	private LanguageEN(String path, String message) {
		this.path = path;
		this.message = message;
	}

	@Override
	public String getPath() {
		return path;
	}

	@Override
	public String getDefaultMessage() {
		return message;
	}
}