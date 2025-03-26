package com.example.demo.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("NON_NAVIGANT")
public class NonNavigant extends Personnel {
}
