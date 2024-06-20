package com.gmail.onishchenko.lessons.lesson11;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.imei = "007";
        System.out.println("device.imei = " + device.imei);

        Device prettyDevice = new Device();
        prettyDevice.imei = "I'm pretty";
        device.imei = "***";
        System.out.println("device.imei = " + device.imei);
        System.out.println("prettyDevice.imei = " + prettyDevice.imei);
    }
}
