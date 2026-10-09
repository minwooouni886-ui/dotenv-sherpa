package io.github.minwooouni886.sherpa;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new Sherpa()).execute(args);
        System.exit(exitCode);
    }
}
