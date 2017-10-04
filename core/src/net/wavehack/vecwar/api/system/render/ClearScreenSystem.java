package net.wavehack.vecwar.api.system.render;

import com.artemis.BaseSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

public class ClearScreenSystem extends BaseSystem {

    private final Color color = Color.BLACK;

    public ClearScreenSystem() {
    }

    public ClearScreenSystem(Color color) {
        this.color.set(color);
    }

    @Override
    protected void processSystem() {
        Gdx.gl.glClearColor(this.color.r, this.color.g, this.color.b, this.color.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

}
