package com.gmail.onishchenko.lessons.lesson15;

public class Task {
    private static final String[] AVAILABLE_STATUSES = {
            "TODO",
            "IN_PROGRESS",
            "DONE"
    };
    private String status;
    private String description;

    public Task(String status, String description) {
        validate(status);
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    private void validate(String status) {
        for (String availableStatus : AVAILABLE_STATUSES) {
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
