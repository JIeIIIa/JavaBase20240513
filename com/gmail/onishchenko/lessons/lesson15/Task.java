package com.gmail.onishchenko.lessons.lesson15;

public class Task {
    private String status;
    private String description;

    public Task(String status, String description) {
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

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
