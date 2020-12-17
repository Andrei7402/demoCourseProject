package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@Entity
@Data
public class Scholarship extends BaseEntity {

    private int programming;
    private int mathematics;
    private int siSharp;
    private int physical;
    private int economic;

}
