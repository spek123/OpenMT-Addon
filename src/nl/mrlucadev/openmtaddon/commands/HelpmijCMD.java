package nl.mrlucadev.openmtaddon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import nl.mrlucadev.openmtaddon.utils.Utils;

public class HelpmijCMD implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("helpmij")) {
			if (args.length == 0) {
				sender.sendMessage(Utils.cc("&3Gebruik &b/" + label + " <Reden>"));
				return true;	
			}
			if (Utils.getOnlineStaff().size() == 0) {
				sender.sendMessage(Utils.cc("&cEr zijn &4geen &cstaffleden online!"));
				return true;
			}
			String bc = "";
			for (String arg: args) {
				bc = bc + arg + " ";
			}
			for (Player p: Utils.getOnlineStaff()) {
				p.sendMessage(Utils.cc("&f[&c&lHELPMIJ&f] &7" + sender.getName() + ": " + bc));
			}
		}
		return true;
	}
}
