package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    Iterable<Playlist> findAllByUserUsername(String username);

    @Query(value = "select * from playlist order by creation_time desc limit 10", nativeQuery = true)
    Iterable<Playlist> findAllByCreationTimeOrderByCreationTime();

    @Query(value = "select * from playlist order by view desc limit 10", nativeQuery = true)
    Iterable<Playlist> findAllByViewOrderByView();

    Iterable<Playlist> findAllByNameContains(String keyword);
}
