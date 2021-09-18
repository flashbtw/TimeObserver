package de.flashyboi.gammellounge.timeobserver.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent ev) {
        Player player = ev.getPlayer();
        if(player.hasPermission("timeobserver.observed")) {

        }
    }
}
