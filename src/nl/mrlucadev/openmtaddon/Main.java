package nl.mrlucadev.openmtaddon;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[OpenMT-Addon] De plugin staat aan!");

    }

    @Override
    public void onDisable() {
        System.out.println("[OpenMT-Addon] De plugin staat uit!");

    }


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("openmt")) {

            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.DARK_AQUA + "-=OpenMT-Addon=-");
                player.sendMessage(ChatColor.DARK_AQUA + "");

            }
        }

        return true;

    }



}
