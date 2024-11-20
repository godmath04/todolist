package com.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed; // Indica si la tarea está completada
    private LocalDateTime createdAt; // Nueva columna para la fecha de creación

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() { // Getter para 'completed'
        return completed;
    }

    public void setCompleted(boolean completed) { // Setter para 'completed'
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() { // Getter para 'createdAt'
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) { // Setter para 'createdAt'
        this.createdAt = createdAt;
    }
}
