package evolution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import evolution.util.Sys;

public class Application {
	public static void write(Object object, String filePath, boolean overwrite, boolean printLog) {
		// File Configurations
		File file = new File(filePath);
		if (file.exists()) {
			if (overwrite == false) {
				Sys.println("The file " + filePath + " already exists. In order to overwrite, set the overwrite property as true.");
				return;
			} else {
				Sys.println("The file " + filePath + " will be overwritten.");
			}
		}
		// Set Options
		DumperOptions options = new DumperOptions();
		options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);// Display data in tree structure; Use indent rather than curly braces; Disable the YAML tags 
		Yaml yaml = new Yaml(options);
		// Dump
		try {
			yaml.dump(object, new FileWriter(filePath));
		} catch (IOException e) {
			Sys.println("An exception occurred while writing to " + filePath + ".");
		}
		// Print Log
		if (printLog) {
			Sys.println(yaml.dump(object));
		}
	}
}
