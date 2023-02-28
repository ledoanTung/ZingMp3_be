package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SingerRepository extends JpaRepository<Singer, Long> {
    public Iterable<Singer> findAllByNameContains(String name);
    public Optional<Singer> findByName(String name);
}
