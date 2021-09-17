package de.flashyboi.gammellounge.timeobserver;

import de.flashyboi.gammellounge.timeobserver.Commands.CommandGetFolder;
import de.flashyboi.gammellounge.timeobserver.events.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TimeObserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getConsoleSender().sendMessage("Plugin Enabled!");
        this.getCommand("datafolder").setExecutor(new CommandGetFolder());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
