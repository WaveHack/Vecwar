package net.wavehack.vecwar.game;

import com.badlogic.gdx.Game;
import net.wavehack.vecwar.game.screen.GameScreen;

public class VecwarGame extends Game {

//    private static VecwarGame instance;

    @Override
    public void create() {
//        instance = this;

		this.setScreen(new GameScreen());
    }

//    public static VecwarGame getInstance() {
//        return instance;
//    }

}
