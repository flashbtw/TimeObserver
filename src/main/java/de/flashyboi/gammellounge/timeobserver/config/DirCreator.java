package de.flashyboi.gammellounge.timeobserver.config;

import org.bukkit.Bukkit;
import java.io.File;

public class DirCreator {
    public File dirname;
    public String dirpath;
    public DirCreator(File dirfile, String dirpath) {
        this.dirpath = dirpath;
        this.dirname = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),this.dirpath);
        if(!this.dirname.exists()) {
            this.dirname.mkdir();
        }
    }
    public String getDirpath() {
        return this.dirpath;
    }
}
