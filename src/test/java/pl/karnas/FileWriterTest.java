package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterTest {

    @Test
    public void shouldWriteToFileGivenContent() throws IOException {
        String content = "String which is wrote to the given file..";
        FileWriter fileWriter = new FileWriter();
        fileWriter.writeToFile("src/test/resources/FileWriterTest.txt", content);
        Assert.assertEquals(new String(Files.readAllBytes(Paths.get("src/test/resources/FileWriterTest.txt"))), content);
    }
}