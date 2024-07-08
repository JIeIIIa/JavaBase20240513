package com.gmail.onishchenko.lessons.lesson15;

import java.util.Objects;

public class Status {
    public static final Status TODO = new Status("TODO");
    public static final Status IN_PROGRESS = new Status("IN_PROGRESS");
    public static final Status DONE = new Status("DONE");

    private final String name;

    private Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Status{" +
                "'" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Status status = (Status) o;
        return Objects.equals(name, status.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
