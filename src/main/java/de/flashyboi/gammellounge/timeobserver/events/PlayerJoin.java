package de.flashyboi.gammellounge.timeobserver.events;

import de.flashyboi.gammellounge.timeobserver.config.FileCreator;
import de.flashyboi.gammellounge.timeobserver.log.DataFolder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.*;
import java.util.Date;

public class PlayerJoin implements Listener {
    File df = new DataFolder().getPluginfolder();
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev){
        Player player = ev.getPlayer();
        String playername = ev.getPlayer().getName();
        if(!player.hasPermission("TimeObserver.observed")) {
            return;
        } else {
            FileCreator joinfile = new FileCreator(new File("joinfile"),"/"+playername+".activity");
            try {
                PrintWriter join = new PrintWriter(new FileWriter(new File(df+"/"+playername+".activity"),true));
            Date date = new Date();
            date.toString();
            join.println(date+": "+playername+" beigetreten");
            join.close();
            } catch (IOException e) {e.printStackTrace();}
        }
    }
}
