package de.flashyboi.gammellounge.timeobserver.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import de.flashyboi.gammellounge.timeobserver.Commands.CommandGetFolder;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev){
        Player player = ev.getPlayer();
        String playername = ev.getPlayer().getName();
        if(!player.hasPermission("TimeObserver.observed")) {
            ev.setJoinMessage(playername+" wird in Ruhe gelassen!");
        } else {
            ev.setJoinMessage(playername+" wird beobachtet!");
        }
    }
}
