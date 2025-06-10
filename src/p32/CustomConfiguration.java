package p32;

import java.util.ArrayList;

public class CustomConfiguration extends Configuration {

	public CustomConfiguration(String appName) {
		super(appName);
	//	this.appName = "NewName"; // Error: The final field Configuration.appName cannot be assigned
		modules.add("analytics"); // OK (reference is final, not object)
	}

	/* Error: CustomConfiguration overrides final method p32.Configuration.describe()
	public void describe() {
		System.out.println("App: " + appName);
		System.out.println("Modules: " + modules);
	}
	*/
	
	/* What can/cannot be changed with final:
	 * final primitive variable -> value cannot be reassigned
	 * final object reference -> value (i.e. reference) cannot be changed. But object's state can be changed
	 * final method -> cannot override
	 * final class -> cannot extend
	 */
}
