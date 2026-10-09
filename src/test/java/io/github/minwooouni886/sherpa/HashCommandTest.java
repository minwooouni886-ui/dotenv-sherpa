package io.github.minwooouni886.sherpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import picocli.CommandLine;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashCommandTest {
    @Test
    public void hashCommandExitsCleanly(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("test.env");
        Files.writeString(file, "hello");

        int exitcode = new CommandLine(new Sherpa()).execute("hash", file.toString());

        assertEquals(0, exitcode);
    }
}
