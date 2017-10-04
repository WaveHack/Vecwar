package net.wavehack.vecwar.api.screen.core;

import com.artemis.World;
import com.badlogic.gdx.ScreenAdapter;

public abstract class WorldScreen extends ScreenAdapter {

    protected World world;

    protected abstract World createWorld();

    @Override
    public void show() {
        if (this.world == null) {
            this.world = this.createWorld();
        }
    }

    @Override
    public void render(float delta) {
        this.world.setDelta(delta);
        this.world.process();
    }

}
