package net.wavehack.vecwar.api.component.physics;

import com.artemis.Component;
import com.badlogic.gdx.math.Vector2;

public class Bounds extends Component {

    public Vector2 size = new Vector2();
    public Vector2 pivot = new Vector2(0.5f, 0.5f);

    public Bounds() {
    }

    public Bounds(Vector2 size) {
        this.size.set(size);
    }

    public Bounds(float sizeX, float sizeY) {
        this.size.set(sizeX, sizeY);
    }

    public Bounds(Vector2 size, Vector2 pivot) {
        this.size.set(size);
        this.pivot.set(pivot);
    }

    public Bounds(float sizeX, float sizeY, float pivotX, float pivotY) {
        this.size.set(sizeX, sizeY);
        this.pivot.set(pivotX, pivotY);
    }

}
