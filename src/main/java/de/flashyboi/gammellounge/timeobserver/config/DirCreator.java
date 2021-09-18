package de.flashyboi.gammellounge.timeobserver.config;

import org.bukkit.Bukkit;
import java.io.File;

public class DirCreator {
    public File dirfile;
    public String dirpath;
    public DirCreator(File dirfile, String dirpath) {
        this.dirpath = dirpath;
        this.dirfile = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),this.dirpath);
        if(!this.dirfile.exists()) {
            this.dirfile.mkdir();
        }
    }
    public String getDirpath() {
        return this.dirpath;
    }
}
