package com.telusko.SimpleWebApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
@Entity
public class Product {

    @Id
    private  int prodId;
    private String prodName;
    private int price;
}
