package com.yxc.repository;

import com.yxc.model.BlogEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yangxiaochen on 16/9/4.
 */
@Repository
public interface BlogRepository extends JpaRepository<BlogEntity,Integer> {
//    @Autowired
}
