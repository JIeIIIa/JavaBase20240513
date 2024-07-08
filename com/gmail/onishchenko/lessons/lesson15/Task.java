package com.gmail.onishchenko.lessons.lesson15;

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

}
