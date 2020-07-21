package com.example.adboard.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ad")
public class Advertisement {

    @Id
    @GeneratedValue

    private Long id;

    private String title;

    private String text;
}
