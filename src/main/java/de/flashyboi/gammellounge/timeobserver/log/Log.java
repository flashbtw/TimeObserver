package de.flashyboi.gammellounge.timeobserver.log;

import org.bukkit.Bukkit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*public class Log {
    public void printToFile(String message) {
        try {
            File saveTo = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),"activity.log");
            File dataFolder = Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder();
            if (!dataFolder.exists()) {
                dataFolder.mkdir();
            }
            saveTo = new File(Bukkit.getServer().getPluginManager().getPlugin("TimeObserver").getDataFolder(),"activity.log");
            if (!saveTo.exists()) {
                saveTo.createNewFile();
            }
            FileWriter fw = new FileWriter(saveTo, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(message);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/