package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileReaderTest {

    @Test
    public void shouldReturnNotEmptyString() {
        String randomLine = new FileReader().readRandomLineFromFile();
        Assert.assertTrue(randomLine.length() != 0);
    }
}