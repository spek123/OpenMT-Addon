package nl.mrlucadev.openmtaddon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nl.mrlucadev.openmtaddon.utils.Utils;

public class AlertCMD implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("alert")) {
			if (!sender.hasPermission("openmtaddons.alert")) { 
				sender.sendMessage(Utils.cc("&cJij hebt hier &4geen &ctoestemming voor."));
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage(Utils.cc("&3Gebruik &b/" + label + " <Bericht>&3!"));
				return true;	
			}
			String bc = "";
			for (String arg: args) {
				bc = bc + arg + " ";
			}
			Bukkit.broadcastMessage(Utils.cc("&f[&c&lALERT&f] " + bc));
		}
		return true;

	}
}
