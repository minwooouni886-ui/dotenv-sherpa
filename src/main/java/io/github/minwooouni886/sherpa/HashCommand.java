package io.github.minwooouni886.sherpa;

import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.File;

@Command(name = "hash", mixinStandardHelpOptions = true)
public class HashCommand implements Runnable {

    @Parameters(index = "0", description = "The file to hash")
    private File file;


    @Override
    public void run() {
        String hashed = Hasher.sha256(file.toPath());
        System.out.println(hashed);
    }
}
