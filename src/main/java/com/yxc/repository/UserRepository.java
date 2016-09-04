package com.yxc.repository;

import com.yxc.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yangxiaochen on 16/9/4.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
