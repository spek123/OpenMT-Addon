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
                player.sendMessage(ChatColor.DARK_AQUA + "Deze server maakt gebruik van de gratis te downloaden " + ChatColor.AQUA + "OpenMT-Addon");
                player.sendMessage(ChatColor.DARK_AQUA + "Deze plugin is opensource!");
                player.sendMessage(ChatColor.DARK_AQUA + "Support Discord: " + ChatColor.AQUA + "https://discord.gg/8AudWCT");
                player.sendMessage(ChatColor.DARK_AQUA + "Plugin gemaakt door: " + ChatColor.AQUA + "MrLuca, MrWouter");
                player.sendMessage(ChatColor.DARK_AQUA + "Versie: " + ChatColor.AQUA + "1.0");

            }
        }

        return true;

    }



}
