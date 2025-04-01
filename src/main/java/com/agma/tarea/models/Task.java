package com.agma.tarea.models;

public class Task {
    private String name;
    private String description;
    private String status;

    // Constructor vacío
    public Task() {}

    // Constructor con parámetros
    public Task(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "Task{name='" + name + "', description='" + description + "', status='" + status + "'}";
    }
}
