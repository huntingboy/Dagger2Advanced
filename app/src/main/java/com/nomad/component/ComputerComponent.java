package com.nomad.component;

import com.nomad.domain.Computer;
import com.nomad.module.MouseModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MouseModule.class)
public interface ComputerComponent {
    void inject(Computer computer);
}
