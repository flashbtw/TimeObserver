package de.flashyboi.gammellounge.timeobserver.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        String player = event.getPlayer().getName();
        Bukkit.broadcastMessage(player+" joined.");

    }

}
