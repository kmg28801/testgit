package com.example.git.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GitTest {

    @Id @GeneratedValue
    private Long id;
}
