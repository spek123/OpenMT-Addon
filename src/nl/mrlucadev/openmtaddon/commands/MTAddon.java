package nl.mrlucadev.openmtaddon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nl.mrlucadev.openmtaddon.utils.Utils;

public class MTAddon implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mtaddon")) {
        	sender.sendMessage(Utils.cc("&3[&blOpen&bMTAddons&3]"));
        	sender.sendMessage(Utils.cc("&3/clearchat - &bLeeg de chat!"));
        	sender.sendMessage(Utils.cc("&3/alert - &bBroadcast een bericht!"));
        	sender.sendMessage(Utils.cc("&3/helpmij - &bVraag staff voor hulp!"));
        }
        return true;
    }
}
