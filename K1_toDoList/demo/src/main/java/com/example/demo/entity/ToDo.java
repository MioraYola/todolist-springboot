package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id; 
    private String title;
    private String description; 
    private Instant startDateTime;
    private Instant endDateTime; 
    private boolean done; 
}
