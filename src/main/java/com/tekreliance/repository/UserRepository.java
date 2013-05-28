package com.tekreliance.repository;

import com.tekreliance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 12:30 PM
 */

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email=:email and u.password=:password")
    public User findOneByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
