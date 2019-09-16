package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomWordsGeneratorTest {

    @Test
    public void shouldReturnNotEmptyStringBuilder() {
        StringBuilder randWord = new RandomWordsGenerator().generateFewRandomWords(2);
        Assert.assertTrue(randWord.length()!=0);
    }
}