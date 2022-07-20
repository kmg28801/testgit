package com.example.git.repository;


import com.example.git.entity.GitTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitTestRepo extends JpaRepository<GitTest, Long> {
}
