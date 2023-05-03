package org.fifth;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    public List<File> searchFiles(String fileName) {
        List<File> foundFiles = new ArrayList<>();

        File desktopDirectory = new File(System.getProperty("user.home"), "Desktop");
        searchFilesInDirectory(fileName, desktopDirectory, foundFiles);

        return foundFiles;
    }

    private void searchFilesInDirectory(String fileName, File directory, List<File> foundFiles) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchFilesInDirectory(fileName, file, foundFiles);
                    } else {
                        if (file.getName().equals(fileName)) {
                            foundFiles.add(file);
                        }
                    }
                }
            }
        }
    }
}
