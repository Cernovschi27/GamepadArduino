package com.Joystick.applayer.singleton.bluetooth.event;


public class BluetoothConnectedEvent {
    String name;
    String address;

    public BluetoothConnectedEvent() {
    }

    public BluetoothConnectedEvent(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
