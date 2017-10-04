package net.wavehack.vecwar.api.component.spatial;

import com.artemis.Component;
import com.badlogic.gdx.math.Vector2;

public class Position extends Component {

    public Vector2 position = new Vector2();

    public Position() {
    }

    public Position(Vector2 position) {
        this.position.set(position);
    }

    public Position(float x, float y) {
        this.position.set(x, y);
    }

}
