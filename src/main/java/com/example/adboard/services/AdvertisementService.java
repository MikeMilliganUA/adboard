package com.example.adboard.services;

import com.example.adboard.entities.Advertisement;

import java.util.Optional;

public interface AdvertisementService {

    Optional<Advertisement> findById(Long id);
}
