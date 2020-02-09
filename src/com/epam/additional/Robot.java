package com.epam.additional;

public class Robot {
    private String action = "просто работаю";

    public String getAction() {
        return action;
    }

    public void work() {
        System.out.println("Я " + this.getClass().getSimpleName() + " - я " + getAction());
    }
}
