package co.uk.aegisphere;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import co.uk.aegisphere.GameDev1;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {

	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("as-gamedev1-drop");
		config.setWindowedMode(800, 480);
		config.useVsync(true);
		new Lwjgl3Application(new GameDev1(), config);
	}
}
