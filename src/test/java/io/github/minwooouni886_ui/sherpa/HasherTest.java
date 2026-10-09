package io.github.minwooouni886_ui.sherpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;


public class HasherTest {

    @Test
    void hashOfHello(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("test.end");
        Files.writeString(file, "hello");

        String hashed = Hasher.sha256(file);

        assertEquals("2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824", hashed);
    }

}
