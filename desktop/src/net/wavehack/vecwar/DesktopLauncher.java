package net.wavehack.vecwar;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.wavehack.vecwar.game.VecwarGame;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "Vecwar";

        config.width = 1280;
        config.height = 720;

        new LwjglApplication(new VecwarGame(), config);
    }

}
