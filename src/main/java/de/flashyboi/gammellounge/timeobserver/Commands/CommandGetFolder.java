package de.flashyboi.gammellounge.timeobserver.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Date;

public class CommandGetFolder implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (args.length != 0) {
                return false;
            } else {
                if (sender instanceof Player) {
                    Date date = new Date();
                    String datestring = date.toString();
                    sender.sendMessage("Der Plugin Ordner ist: " + Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder());
                    sender.sendMessage(datestring);
                } else {
                    return false;
                }
            }
    return true;
    }
}
