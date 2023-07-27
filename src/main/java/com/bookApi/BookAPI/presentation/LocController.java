package com.bookApi.BookAPI.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocController {
    @GetMapping("/searchLocResults")
    public String getResults(@RequestParam(value = "q") String query) {
        return "Searching for books related to " + query;
    }


}
