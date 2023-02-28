package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.LikeSong;
import com.website.ZingMp3_be.entity.LikeSongId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface LikeSongRepository extends CrudRepository<LikeSong, LikeSongId> {
    @Query(value = "select id from song\n" +
            "    join (select count(user_id) as like_number, song_id\n" +
            "    from like_song group by song_id order by like_number desc)\n" +
            "        likesong where id = likesong.song_id\n" +
            "order by likesong.like_number desc limit 10", nativeQuery = true)
    Iterable<BigInteger> findAllByUserLike();

    @Query(value = "select count(user_id) as like_number, song_id\n" +
            "from like_song group by song_id\n" +
            "order by like_number desc limit 10;", nativeQuery = true)
    List<BigInteger> findAllByLikeNumberOfSong();
}
