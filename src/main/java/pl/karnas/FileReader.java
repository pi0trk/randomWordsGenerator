package pl.karnas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Random;
import java.util.logging.Logger;

class FileReader {

    private static final Logger log = Logger.getLogger(FileReader.class.getName());
    private final Random random = new Random();
    private static final String FILE = "src/test/resources/500words";

    String readRandomLineFromFile() {
        long randomLine = generateRandomLineNumber();
        String result = "";
        final Optional<String> line;
        try {
            line = Files.lines(Paths.get(FILE)).skip(randomLine - 1).findFirst();
            if (line.isPresent()) result = line.get();
        } catch (IOException e) {
            log.info(FILE + "---> Not such file ---");
        }
        return result;
    }

    private int generateRandomLineNumber() {
        return random.nextInt(500) + 1;
    }
}
