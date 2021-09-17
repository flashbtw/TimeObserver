package de.flashyboi.gammellounge.timeobserver.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class CommandGetFolder implements CommandExecutor {
        public File datafolder = Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder();
        public File getDatafolder() {
            return this.datafolder;
        }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
        Bukkit.getServer().broadcastMessage("Der Ordner lautet "+getDatafolder());
        }
    return true;
    }
}
