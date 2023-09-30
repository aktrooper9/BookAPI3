package com.bookApi.BookAPI.service;

import com.bookApi.BookAPI.dto.ResultList;
import org.springframework.stereotype.Service;
import com.bookApi.BookAPI.repository.LocRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@Service
public class LocService {
    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public ResultList getResults(String query){
        ResultList itemList = locRepository.getResults(query);
        return itemList;
    }


}
