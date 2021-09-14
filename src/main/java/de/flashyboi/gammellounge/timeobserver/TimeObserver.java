package de.flashyboi.gammellounge.timeobserver;

import de.flashyboi.gammellounge.timeobserver.events.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public final class TimeObserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getConsoleSender().sendMessage("Plugin Enabled!");
        File dataFolder = getDataFolder();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
