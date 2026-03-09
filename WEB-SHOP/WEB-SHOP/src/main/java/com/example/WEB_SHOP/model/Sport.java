package com.example.WEB_SHOP.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sports")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Sport {
    @Id
    @Column(name = "sport_id") 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id ;
    @Column(name = "sport_name") 
    private String name ; 
    @Column (name = "description")
    private String description ; 
    private LocalDateTime  createAt ; 

     
} 
