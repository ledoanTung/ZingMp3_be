package com.website.ZingMp3_be.repository;

import com.website.ZingMp3_be.entity.User;
import com.website.ZingMp3_be.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
    UserDetail getUserDetailByUser(User user);
}
