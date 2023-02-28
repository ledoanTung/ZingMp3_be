package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.LikePlaylist;
import com.website.ZingMp3_be.entity.LikePlaylistId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface LikePlaylistRepository extends CrudRepository<LikePlaylist, LikePlaylistId> {
    @Query(value = "select id from playlist join (select count(user_id) as like_number, playlist_id from like_playlist group by playlist_id order by like_number desc) likeplaylist where id = likeplaylist.playlist_id order by likeplaylist.like_number desc limit 5", nativeQuery = true)
    Iterable<BigInteger>findAllByLikePlaylistIdIsLike();

    @Query(value = "select count(user_id) as like_number, playList_id\n" +
            "from like_playlist group by playList_id \n" +
            "order by like_number desc limit 5", nativeQuery = true)
    List<BigInteger>findAllByLikeNumberOfPlaylist();
}
