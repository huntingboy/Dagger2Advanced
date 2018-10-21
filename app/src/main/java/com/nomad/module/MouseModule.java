package com.nomad.module;

import com.nomad.annotation.MouseType;
import com.nomad.domain.Mouse;
import com.nomad.domain.WiredMouse;
import com.nomad.domain.WirelessMouse;

import dagger.Module;
import dagger.Provides;

@Module
public class MouseModule {

    @Provides
    @MouseType("wired")
    Mouse provideWiredMouse() {
        return new WiredMouse();
    }

    @Provides
    @MouseType("wireless")
    Mouse provideWirelessMouse() {
        return new WirelessMouse();
    }
}
