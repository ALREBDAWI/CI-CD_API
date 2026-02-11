package org.jee.demoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private int idRole;
    private String labelRole;
}
