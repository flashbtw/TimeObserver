package de.flashyboi.gammellounge.timeobserver.log;

import org.bukkit.Bukkit;

import java.io.File;

public class DataFolder {
    File datafolder;
    public File getPluginfolder() {
        return Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder();
    }
}
