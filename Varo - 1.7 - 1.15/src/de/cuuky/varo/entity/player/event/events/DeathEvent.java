package de.cuuky.varo.entity.player.event.events;

import java.util.Date;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import de.cuuky.varo.Main;
import de.cuuky.varo.configuration.configurations.config.ConfigSetting;
import de.cuuky.varo.entity.player.VaroPlayer;
import de.cuuky.varo.entity.player.event.BukkitEvent;
import de.cuuky.varo.entity.player.event.BukkitEventType;
import de.cuuky.varo.entity.player.stats.stat.PlayerState;
import de.cuuky.varo.entity.player.stats.stat.inventory.InventoryBackup;
import de.cuuky.varo.game.state.GameState;
import de.cuuky.varo.game.world.border.decrease.DecreaseReason;

public class DeathEvent extends BukkitEvent {

	public DeathEvent() {
		super(BukkitEventType.KILLED);
	}

	@Override
	public void onExec(VaroPlayer player) {
		player.getStats().addInventoryBackup(new InventoryBackup(player));

		player.getStats().removeCountdown();
		player.getStats().setDiedAt(new Date());
		player.getStats().setState(PlayerState.DEAD);

		if(ConfigSetting.BACKPACK_PLAYER_DROP_ON_DEATH.getValueAsBoolean()) {
			if(player.getStats().getPlayerBackpack() != null) {
				for(ItemStack item : player.getStats().getPlayerBackpack().getInventory().getContents()) {
					if(item != null && item.getType() != Material.AIR) {
						player.getPlayer().getWorld().dropItemNaturally(player.getPlayer().getLocation(), item);
					}
				}
			}
		}

		if(ConfigSetting.BACKPACK_TEAM_DROP_ON_DEATH.getValueAsBoolean()) {
			if(player.getTeam() != null && player.getTeam().isDead() && player.getTeam().getTeamBackPack() != null) {
				for(ItemStack item : player.getTeam().getTeamBackPack().getInventory().getContents()) {
					if(item != null && item.getType() != Material.AIR) {
						player.getPlayer().getWorld().dropItemNaturally(player.getPlayer().getLocation(), item);
					}
				}
			}
		}

		if(Main.getVaroGame().getGameState() == GameState.STARTED)
			Main.getVaroGame().getVaroWorld().getVaroBorder().decreaseBorder(DecreaseReason.DEATH);
	}
}