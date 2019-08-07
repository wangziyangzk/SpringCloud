package com.wzy.microserviceprovideruser.Repository;

import com.wzy.microserviceprovideruser.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
