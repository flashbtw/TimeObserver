package de.flashyboi.gammellounge.timeobserver;

import de.flashyboi.gammellounge.timeobserver.config.DirCreator;
import de.flashyboi.gammellounge.timeobserver.config.FileCreator;
import de.flashyboi.gammellounge.timeobserver.Commands.CommandGetFolder;
import de.flashyboi.gammellounge.timeobserver.events.PlayerJoin;
import de.flashyboi.gammellounge.timeobserver.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class TimeObserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        this.getCommand("datafolder").setExecutor(new CommandGetFolder());
        DirCreator main = new DirCreator(new File("mainDir"),"");
        getServer().getConsoleSender().sendMessage("Plugin Enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
