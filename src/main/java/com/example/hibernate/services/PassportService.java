package com.example.hibernate.services;

import com.example.hibernate.entity.Passport;
import com.example.hibernate.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepository;

    public Passport getPassport(int id) {
        Optional<Passport> passport = passportRepository.findById(id);
        return passport.get();
    }
}