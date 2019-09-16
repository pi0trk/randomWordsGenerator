package pl.karnas;

/**
 * Random words are saved to file (from dictionary) are saved to file.
 *
 * @author pi0trk
 */
public class App {
    private static final String FILE = "src/test/resources/RandomWords.txt";

    public static void main(String[] args) {
        int nrOfRandomWords = 99;

        RandomWordsGenerator randomWordsGenerator = new RandomWordsGenerator();

        StringBuilder randWords;
        randWords = randomWordsGenerator.generateFewRandomWords(nrOfRandomWords);

        FileWriter fileWriter = new FileWriter();
        fileWriter.writeToFile(FILE, randWords.toString());
    }
}
