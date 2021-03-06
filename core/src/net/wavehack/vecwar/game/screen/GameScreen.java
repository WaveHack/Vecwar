package net.wavehack.vecwar.game.screen;

import com.artemis.World;
import com.artemis.WorldConfigurationBuilder;
import com.artemis.managers.TagManager;
import net.wavehack.vecwar.api.screen.core.WorldScreen;
import net.wavehack.vecwar.api.system.render.ClearScreenSystem;
import net.wavehack.vecwar.game.system.view.GameScreenSetupSystem;

public class GameScreen extends WorldScreen {

    @Override
    protected World createWorld() {
        return new World(new WorldConfigurationBuilder()
            .with(WorldConfigurationBuilder.Priority.NORMAL,

                new TagManager(),

                // Passive - System

                // Initialize
                //new GameScreenAssetSystem(),
                new GameScreenSetupSystem(),

                // Active - Input

                // Active - Physics

                // Active - Render
                new ClearScreenSystem()

                // Active - GUI

            )
            .build());
    }

}
