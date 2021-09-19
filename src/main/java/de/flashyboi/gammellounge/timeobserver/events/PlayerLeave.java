package de.flashyboi.gammellounge.timeobserver.events;

import de.flashyboi.gammellounge.timeobserver.config.FileCreator;
import de.flashyboi.gammellounge.timeobserver.log.DataFolder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.io.*;
import java.util.Date;

public class PlayerLeave implements Listener {
    File df = new DataFolder().getPluginfolder();
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent ev) {
        Player player = ev.getPlayer();
        String playername = ev.getPlayer().getName();
        if(player.hasPermission("timeobserver.observed")) {
            if(!player.hasPermission("TimeObserver.observed")) {
                return;
            } else {
                FileCreator joinfile = new FileCreator(new File("joinfile"),"/"+playername+".activity");
                try {
                    PrintWriter quit = new PrintWriter(new FileWriter(new File(df+"/"+playername+".activity"),true));
                    Date date = new Date();
                    date.toString();
                    quit.println(date+": "+playername+" verlassen");
                    quit.close();
                } catch (IOException e) {e.printStackTrace();}
            }
        }
    }
}
