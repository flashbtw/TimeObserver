package de.flashyboi.gammellounge.timeobserver;

import de.flashyboi.gammellounge.timeobserver.config.DirCreator;
import de.flashyboi.gammellounge.timeobserver.config.FileCreator;
import de.flashyboi.gammellounge.timeobserver.Commands.CommandGetFolder;
import de.flashyboi.gammellounge.timeobserver.events.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class TimeObserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getConsoleSender().sendMessage("Plugin Enabled!");
        this.getCommand("datafolder").setExecutor(new CommandGetFolder());
        DirCreator main = new DirCreator(new File("mainDir"),"");
        DirCreator logs = new DirCreator(new File("logDir"),"/logs");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
