package com.example.WEB_SHOP.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "brands")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id 
    @Column(name = "brand_id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer  Id; 
    @Column(name = "brand_name" , nullable =  false)
    private String name ;
    @Column(name =  "description")
    private String  description ; 
    

}
