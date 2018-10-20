package com.nrsoft.ex.picocli_ex;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "Greet", header = "%n@|green Hello world demo|@")
public class Greet implements Runnable {

  @Option(names = {"-u", "--user"}, required = true, description = "The user name.")
  String userName;

  public void run() {
    System.out.println("Hello, " + userName);
  }

  public static void main(String... args) {
    CommandLine.run(new Greet(), System.err, args);
  }
}