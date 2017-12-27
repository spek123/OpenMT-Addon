package nl.mrlucadev.openmtaddon;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IkWilKaas implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("ikwilkaas")) {

            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GOLD + "Ik ben ook een klant!");

            }
            
        }

        return true;

    }

}
