package net.wavehack.vecwar.api.component.spatial;

import com.artemis.Component;

public class Rotation extends Component {

    public static final float RIGHT = 0;
    public static final float DOWN = 90;
    public static final float LEFT = 180;
    public static final float UP = 270;

    public float angle = UP;

    public Rotation() {
    }

    public Rotation(float angle) {
        this.angle = angle;
    }

}
