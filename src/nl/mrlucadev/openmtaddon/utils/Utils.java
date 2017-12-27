package nl.mrlucadev.openmtaddon.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class Utils {

	public static String cc(String toTranslate) {
		return ChatColor.translateAlternateColorCodes('&', toTranslate);
	}

	public static List<Player> getOnlineStaff() {
		List<Player> staff = new ArrayList<>();
		for (Player p : Bukkit.getOnlinePlayers()) {
			if (p.hasPermission("openmtaddons.staff") && p.getGameMode() != GameMode.SPECTATOR) {
				staff.add(p);
			}
		}
		return staff;
	}
}
