package com.gmail.onishchenko.lessons.lesson15;

import java.util.Objects;

public class Task {
    private static final Status[] AVAILABLE_STATUSES = {
            Status.TODO,
            Status.IN_PROGRESS,
            Status.DONE
    };
    private Status status;
    private String description;

    public Task(Status status, String description) {
        validate(status);
        this.status = status;
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    private void validate(Status status) {
        for (Status availableStatus : AVAILABLE_STATUSES) {
            if (availableStatus.equals(status)) {
//            if (status.equals(availableStatus)) {
                return;
            }
        }
        throw new RuntimeException("Unknown status: " + status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Status {
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
}
