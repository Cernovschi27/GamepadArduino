package com.Joystick.applayer.singleton;

import com.squareup.otto.Bus;


public class BusProvider {
    private static BusProvider busProvider;

    public static BusProvider getInstance() {
        if (busProvider == null) {
            busProvider = new BusProvider();
        }
        return busProvider;
    }

    private Bus bus;

    public BusProvider() {
        bus = new Bus();
    }

    public Bus getProvider() {
        return bus;
    }
}
