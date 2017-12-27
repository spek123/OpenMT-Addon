package nl.mrlucadev.openmtaddon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import nl.mrlucadev.openmtaddon.utils.Utils;

public class ClearchatCMD implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("clearchat")) {
			if (!sender.hasPermission("openmtaddons.clearchat")) { 
				sender.sendMessage(Utils.cc("&cJij hebt hier &4geen &ctoestemming voor."));
				return true;
			}
			if (args.length == 0) {
				for(int i = 0; i<255; i++) {
					Bukkit.broadcastMessage(" ");
				}
				//The chat has been cleared by ..? 
				return true;	
			}
			Player target = Bukkit.getPlayer(args[0]);
			if (target != null && target.isOnline()) {
				for(int i = 0; i<255; i++) {
					target.sendMessage(" ");
				}
				return true;	
			}
			sender.sendMessage(Utils.cc("&3Jij hebt de &bchat&3 van &b" + target.getName() + " &3geleegd."));
		}
		return true;

	}
}
