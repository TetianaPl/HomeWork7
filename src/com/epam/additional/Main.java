package com.epam.additional;

public class Main {
    public static void main(String[] args) {
        Robot mike = new Robot();
        mike.work();
        CoffeRobot nick = new CoffeRobot();
        nick.work();
        RobotDancer jack = new RobotDancer();
        jack.work();
        RobotCoocker sarah = new RobotCoocker();
        sarah.work();

        Robot[] robots = {
                new Robot(),
                new Robot(),
                new CoffeRobot(),
                new CoffeRobot(),
                new RobotDancer(),
                new RobotDancer(),
                new RobotCoocker(),
                new RobotCoocker()
        };

        for (Robot elem : robots) {
            elem.work();
        }

    }
}
