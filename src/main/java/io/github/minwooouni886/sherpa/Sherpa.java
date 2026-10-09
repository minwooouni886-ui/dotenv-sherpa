package io.github.minwooouni886.sherpa;

import net.schmizz.sshj.connection.channel.direct.Session;
import picocli.CommandLine;

@CommandLine.Command(name = "sherpa", mixinStandardHelpOptions = true, subcommands = { HashCommand.class})
public class Sherpa implements Runnable{
    @Override
    public void run() {
        new CommandLine(this).usage(System.out);
    }
}
