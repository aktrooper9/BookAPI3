package com.bookApi.BookAPI.repository;

import com.bookApi.BookAPI.dto.ResultList;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.googleapis.com/books/v1/volumes"; //I am 100% sure that this is not correct
    private final String yourAPIKey="AIzaSyCmNoIcMptf7SBUj-m5iCuKkod8AU2eDXw" ;

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public ResultList getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", query)
                        .queryParam("intitle", query)
                        .queryParam("inauthor", query)
                        .queryParam("apiKey",yourAPIKey)

                        .build()
                )
                .retrieve()
                .bodyToMono(ResultList.class)
                .block();
    }


}
