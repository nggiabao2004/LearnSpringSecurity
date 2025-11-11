package com.nggiabao2004.security.service;

import com.nggiabao2004.security.entity.UserPrincipal;
import com.nggiabao2004.security.entity.Users;
import com.nggiabao2004.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Users user = repo.findByUsername(username);
        if (user == null) {
            System.out.println("Username not found");
            throw new UsernameNotFoundException("Username not found");
        }
        return new UserPrincipal(user);
    }
}
