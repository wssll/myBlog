package com.sll.blog.dao;

import com.sll.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);

    @Query("select u from User u where u.username=?1 and u.password=?2 and u.role=?3")
    User findByUPR(String username,String password,String role);

    User findByUsername(String username);
}
