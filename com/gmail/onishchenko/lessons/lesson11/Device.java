package com.gmail.onishchenko.lessons.lesson11;

public class Device {
     String imei;

     public Device() {
          imei = "default";
     }

     public Device(String target) {
          imei = target;
     }

     public void describe() {
          System.out.printf("I'm a device with [imei = %s]\n", imei);
     }
}
