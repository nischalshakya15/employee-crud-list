package org.personal.employee.entity;

import org.personal.employee.base.BaseEntity;

import java.time.LocalDateTime;

public class Department extends BaseEntity {

    private String name;

    private String description;

    public Department(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name, String description) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.description = description;
    }

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
}
