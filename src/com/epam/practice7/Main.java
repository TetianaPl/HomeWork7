package com.epam.practice7;

public class Main {
    public static void main(String[] args) {

        Device[] devices = {
                new Device("AAAP01", "LG", 1100.0),
                new Device("AAAP01", "LG", 1100.0),
                new Device("AdAP01", "Lr", 11.90),
                new Monitor("MP_A9", "HPA", 8500.0, 1024, 848),
                new Monitor("MP_A9", "HPA", 8500.0, 848, 1024),
                new Monitor("MP_A9", "HPA", 8500.0, 1024, 848),
                new Adapter("PP005", "AD", 4562.0, 100, "823_a"),
                new Adapter("PP005", "AD", 4562.0, 100, "823_a"),
                new Adapter("PP005", "AD", 4562.0, 100, "823_b")
        };

        for (Device obj : devices) {
            System.out.println(obj + ", hash: " + obj.hashCode());
        }

        System.out.println("Device 1 = Device 2 -> " + devices[0].equals(devices[1]));
        System.out.println("Device 2 = Device 3 -> " + devices[1].equals(devices[2]));
        System.out.println("Monitor 1 = Monitor 2 -> " + devices[3].equals(devices[4]));
        System.out.println("Monitor 1 = Monitor 3 -> " + devices[3].equals(devices[5]));
        System.out.println("Adapter 1 = Adapter 2 -> " + devices[6].equals(devices[7]));
        System.out.println("Adapter 2 = Adapter 3 -> " + devices[7].equals(devices[8]));
        System.out.println("Device 1 = Monitor 1 -> " + devices[0].equals(devices[3]));
        System.out.println("Monitor 2 = Adapter 3 -> " + devices[4].equals(devices[8]));

    }
}
