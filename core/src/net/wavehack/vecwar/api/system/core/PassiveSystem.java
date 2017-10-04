package net.wavehack.vecwar.api.system.core;

import com.artemis.BaseSystem;

public abstract class PassiveSystem extends BaseSystem {

    @Override
    protected void processSystem() {
    }

    @Override
    protected boolean checkProcessing() {
        return false;
    }

}
