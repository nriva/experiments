package com.nrsoft.ex.picocli_ex;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(version = "Help demo v1.2.3", header = "%nAutomatic Help Demo%n",
description = "Prints usage help and version help when requested.%n")
public class AutomaticHelpDemo implements Runnable {

	@Option(names = "--count", description = "The number of times to repeat.")
	int count;
	
	@Option(names = {"-h", "--help"}, usageHelp = true,
	   description = "Print usage help and exit.")
	boolean usageHelpRequested;
	
	@Option(names = {"-V", "--version"}, versionHelp = true,
	   description = "Print version information and exit.")
	boolean versionHelpRequested;

	public void run() {
	// NOTE: code like below is no longer required:
	//
	// if (usageHelpRequested) {
	//     new CommandLine(this).usage(System.err);
	// } else if (versionHelpRequested) {
	//     new CommandLine(this).printVersionHelp(System.err);
	// } else { ... the business logic
	
		for (int i = 0; i < count; i++) {
		   System.out.println("Hello world");
		}
	}

	public static void main(String... args) {
		CommandLine.run(new AutomaticHelpDemo(), System.err, args);
	}

}