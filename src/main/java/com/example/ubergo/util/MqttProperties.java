package com.example.ubergo.util;


public class MqttProperties {
    //tcp or ssl protocol is supported
    private static String address="tcp://127.0.0.1:1883";
    // add other MQTT properties here as needed
    public MqttProperties(){

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}