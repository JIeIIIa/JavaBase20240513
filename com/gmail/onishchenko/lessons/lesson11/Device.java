package com.gmail.onishchenko.lessons.lesson11;

public class Device {
     String imei;
     int year;

     public Device() {
          this("default", 2024);
     }

     public Device(String imei) {
          this();
//          this(imei, 1234);
          this.imei = imei;
     }

     public Device(String imei, int year) {
          this.imei = imei;
          this.year=  year;
     }

     public void describe() {
          System.out.printf("I'm a device with [imei = %s, year = %d]\n", imei, year);
     }
}
