package com.Joystick.applayer.singleton.bluetooth.event;


public class BluetoothDataReceivedEvent {
    private byte[] data;
    private String message;

    public BluetoothDataReceivedEvent() {
    }

    public BluetoothDataReceivedEvent(byte[] data, String message) {
        this.data = data;
        this.message = message;
    }

    public byte[] getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
