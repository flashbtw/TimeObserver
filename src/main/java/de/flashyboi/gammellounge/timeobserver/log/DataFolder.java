package de.flashyboi.gammellounge.timeobserver.log;

import java.io.File;

public class DataFolder {
    File datafolder;
    public DataFolder(File datafolder) {
        this.datafolder = datafolder;
    }
    public File getDatafolder() {
        return this.datafolder;
    }

}
