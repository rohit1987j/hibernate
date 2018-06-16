package com.example.hibernate.services;

import com.example.hibernate.entity.Passport;
import com.example.hibernate.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepository;

    public Passport getPassport(int id) {
        return passportRepository.findById(id);
    }
}