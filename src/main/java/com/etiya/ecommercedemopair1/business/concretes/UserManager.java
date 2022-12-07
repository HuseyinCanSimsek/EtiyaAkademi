package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.UserService;
import com.etiya.ecommercedemopair1.entities.concretes.User;
import com.etiya.ecommercedemopair1.repository.abstracts.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserRepository userRepository;
    @Autowired

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean existsById(int id) {
        return userRepository.existsById(id);
    }
}
