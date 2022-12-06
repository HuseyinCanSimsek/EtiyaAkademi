package com.etiya.ecommercedemopair1.repository.abstracts;

import com.etiya.ecommercedemopair1.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findById (int id);
}
