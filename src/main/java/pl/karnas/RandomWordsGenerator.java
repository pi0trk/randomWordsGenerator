package pl.karnas;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

class RandomWordsGenerator {

    private static final Logger log = Logger.getLogger(RandomWordsGenerator.class.getName());
    private FileReader fileReader = new FileReader();
    private StringBuilder sb = new StringBuilder();

    StringBuilder generateFewRandomWords(int nrOfRandomWords) {
        if (fileReader.readRandomLineFromFile() != null) {
            for (int i = 0; i < nrOfRandomWords; i++) {
                try {
                    sb.append(fileReader.readRandomLineFromFile()).append("\n");
                } catch (NoSuchElementException e) {
                    log.info("NoSuchElementException ~~-- > StringBuilder overloaded ---");
                    //todo: break or not to break;?
                }
            }
        }
        return sb;
    }
}
