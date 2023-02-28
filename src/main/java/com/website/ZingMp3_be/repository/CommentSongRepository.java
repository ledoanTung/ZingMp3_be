package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.CommentSong;
import com.website.ZingMp3_be.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentSongRepository extends JpaRepository<CommentSong, Long> {
    Iterable<CommentSong> getCommentSongBySongOrOrderByCreationTimeDesc(Song song);
}
