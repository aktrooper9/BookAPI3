package com.bookApi.BookAPI.service;

import com.bookApi.BookAPI.dto.items;
import org.springframework.stereotype.Service;
import com.bookApi.BookAPI.repository.LocRepository;

@Service
public class LocService {
    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public items getResults(String query){
        return locRepository.getResults(query);
    }


}
