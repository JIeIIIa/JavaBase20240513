package com.gmail.onishchenko.lessons.lesson15;

public enum Status implements Runnable {
    TODO(42),
    IN_PROGRESS(7),
    DONE;

    private final int estimation;

    Status() {
        this.estimation = 1;
    }

    Status(int estimation) {
        this.estimation = estimation;
    }

    public int getEstimation() {
        return estimation;
    }

    @Override
    public String toString() {
        return "Status{" +
                "'" + name() + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Running " + name() + "...");
    }
}
