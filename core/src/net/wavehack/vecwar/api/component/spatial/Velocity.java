package net.wavehack.vecwar.api.component.spatial;

import com.artemis.Component;
import com.badlogic.gdx.math.Vector2;

public class Velocity extends Component {

    public Vector2 velocity = new Vector2();

    public Velocity() {
    }

    public Velocity(Vector2 velocity) {
        this.velocity.set(velocity);
    }

    public Velocity(float x, float y) {
        this.velocity.set(x, y);
    }

}
