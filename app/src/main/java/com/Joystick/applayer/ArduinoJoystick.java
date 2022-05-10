package com.Joystick.applayer;

import android.app.Application;

import com.Joystick.applayer.singleton.bluetooth.BluetoothManager;
import com.Joystick.applayer.singleton.Contextor;

public class ArduinoJoystick extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
        BluetoothManager.init(Contextor.getInstance().getContext());
    }
}
