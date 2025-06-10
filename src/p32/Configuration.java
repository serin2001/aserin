package p32;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
	public final String appName;
	public final List<String> modules;

	public Configuration(String appName) {
		this.appName = appName;
		this.modules = new ArrayList<>();
	}

	final void describe() {
		System.out.println("App: " + appName);
		System.out.println("Modules: " + modules);
	}
}
