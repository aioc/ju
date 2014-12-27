package com.ausinformatics.ju;

import com.ausinformatics.phais.core.Config;
import com.ausinformatics.phais.core.Director;

public class JuMain {
	public static void main (String[] args) {
		System.out.println("Ju started");
		Config config = new Config();
		config.parseArgs(args);
		new Director(new PlayerFactory(), new GameFactory()).run(config);
	}
}
