package pl.karnas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

class FileWriter {

    private static final Logger log = Logger.getLogger(FileWriter.class.getName());

    void writeToFile(String filePath, String content) {
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.print(content);
        } catch (FileNotFoundException e) {
            log.info("--- Couldn't write to file. ---");
        }
    }
}