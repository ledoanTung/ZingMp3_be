package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.CommentPlaylist;
import com.website.ZingMp3_be.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentPlaylistRepository extends JpaRepository<CommentPlaylist, Long> {
Iterable<CommentPlaylist> getCommentPlaylistsByPlaylist(Playlist playlist);
}
