package com.nomad.domain;

import android.util.Log;

import com.nomad.annotation.MouseType;
import com.nomad.component.DaggerComputerComponent;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class Computer {
    private static final String TAG = "Computer";

    @Inject
    Cpu mCpu;

    @Inject
    Lazy<Usb> mUsb;

    @Inject
    Provider<Network> mNetworkProvider;

    @Inject
    @MouseType("wireless")
    Mouse mMouse;

    @Inject
    MainBoard mainBoard1;
    @Inject
    MainBoard mainBoard2;

    public void init() {
        DaggerComputerComponent.builder().build().inject(this);
        Log.d(TAG, "init: " + mUsb.get());
        Log.d(TAG, "init: " + mUsb.get());
        Log.d(TAG, "init: " + mNetworkProvider.get());
        Log.d(TAG, "init: " + mNetworkProvider.get());
        Log.d(TAG, "init: " + mMouse.name());
        Log.d(TAG, "init: " + mainBoard1);
        Log.d(TAG, "init: " + mainBoard2);
    }
}
