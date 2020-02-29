package de.cuuky.varo.threads;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.cuuky.varo.Main;
import de.cuuky.varo.version.VersionUtils;

public class SmartLagDetector implements Runnable {

	private ArrayList<Double> lastTps;
	private long lastPost;
	private boolean ramCleared;

	public SmartLagDetector() {
		this.lastTps = new ArrayList<>();

		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new LagCounter(), 100L, 1L);
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), this, 20 * 60, 20);
	}

	private void checkPerformance() {
		lastPost++;
		if(lastPost == 30)
			lastPost = 0;
		else
			return;

		double size = 0, summ = 0;
		for(int index = 0; index <= 30; index++) {
			if(index >= lastTps.size())
				break;

			double tps = (double) lastTps.toArray()[index];

			size++;
			summ += tps;
		}

		double tpsUsage = (double) (summ / size);
		if(tpsUsage <= 14)
			warnAdmins("§4Your CPU-Performance is running low! §cLags could appear!");

		double ramUsage = (double) ((double) Runtime.getRuntime().totalMemory() / (double) Runtime.getRuntime().maxMemory());
		if(ramUsage >= 0.95) {
			if(ramCleared)
				warnAdmins("§4Your RAM is fully used and the plugin couldn't manage to clear it!");

			System.gc();
			ramCleared = true;
		} else
			ramCleared = false;
	}

	private void warnAdmins(String message) {
		for(Player player : VersionUtils.getOnlinePlayer()) {
			if(!player.hasPermission("varo.warnperformance"))
				continue;

			player.sendMessage(Main.getPrefix() + message);
			player.sendMessage(Main.getPrefix() + "§cType /performance for more info and help");
		}
	}

	@Override
	public void run() {
		lastTps.add(LagCounter.getTPS());

		checkPerformance();
	}
}