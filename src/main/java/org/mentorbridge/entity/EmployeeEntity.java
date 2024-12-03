package org.mentorbridge.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Table(name = "EMPLOYEE")
@Entity
@Builder
@AllArgsConstructor
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String role;

    public EmployeeEntity() {

    }
}
