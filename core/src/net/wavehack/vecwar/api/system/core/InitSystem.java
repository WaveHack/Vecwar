package net.wavehack.vecwar.api.system.core;

import com.artemis.BaseSystem;

public abstract class InitSystem extends BaseSystem {

    protected boolean initialized = false;

    protected abstract void init();

    @Override
    protected void processSystem() {
        this.init();
        this.initialized = true;
    }

    @Override
    protected boolean checkProcessing() {
        return !this.initialized;
    }

}
