package de.flashyboi.gammellounge.timeobserver.config;

import org.bukkit.Bukkit;
import java.io.File;
import java.io.IOException;

public class FileCreator {
    public File filef;
    public String filepath;

    public FileCreator(File filef, String filepath) {
        this.filepath = filepath;
        this.filef = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),this.filepath);
        if(!this.filef.exists()) {
            try {
                this.filef.createNewFile();
            } catch (IOException e) { }
        }
    }
    public File getPath() {
        return this.filef;
    }

/*    public void fileChecker() {
        try {
            File pluginDir = Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder();
            File configDir = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),"/configs/");
            File configFile = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),"/configs/config.yml");
            if (!pluginDir.exists()) {
                pluginDir.mkdir();
            }
            if (!configDir.exists()) {
                configDir.mkdir();
            }
            if (!configFile.exists()) {
                try {
                    configFile.createNewFile();
                } catch (IOException e) { e.printStackTrace(); }
            }
        } catch(NullPointerException e) { e.printStackTrace(); }
    }*/
}
