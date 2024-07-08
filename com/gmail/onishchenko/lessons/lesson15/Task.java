package com.gmail.onishchenko.lessons.lesson15;

public class Task {
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
        for (Status availableStatus : Status.values()) {
            if (availableStatus.equals(status)) {
//            if (status.equals(availableStatus)) {
                return;
            }
        }
        throw new RuntimeException("Unknown status: " + status);
    }

    public int estimateDoNotUse() {
        if (status.ordinal() == 1) {
            return 42;
        } else if (status.ordinal() == 0) {
            return 7;
        } else {
            return 1;
        }
    }

    public int estimate() {
        if (status == Status.TODO) {
            return 42;
        } else if (status == Status.IN_PROGRESS) {
            return 7;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
