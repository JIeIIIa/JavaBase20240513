package com.gmail.onishchenko.lessons.lesson15;

public enum Status {
    TODO,
    IN_PROGRESS,
    DONE;

    @Override
    public String toString() {
        return "Status{" +
                "'" + name() + '\'' +
                '}';
    }

}
